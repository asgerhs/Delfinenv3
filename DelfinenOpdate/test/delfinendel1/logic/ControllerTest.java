/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinendel1.logic;

import DelfinenPart1.data.DBConnector;
import DelfinenPart1.data.DataAccessorDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frizz
 */
public class ControllerTest {
    private Controller c;
    private Member mm;
    //private DBConnector connector = null;
    //private Connection connection;
    //DataAccessorDB da = null;

    
    public ControllerTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createMember method, of class Controller.
     */
    @Test
    public void testCreateMember()
    {
        //ved ikke lige hvordan man tester void metoder. i bund og grund skal vi jo teste om metoden skriver til databsen
        
       try{ 
            //da = new DataAccessorDB(new DBConnector());
            String result = "";
            String query = "SELECT * FROM top5 WHERE discipline = 'test3'";
            DBConnector cc = new DBConnector();
            Connection connection = cc.getConnection();
            //assertNotNull(connection);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            connection.setAutoCommit(false);
            stmt.executeUpdate("INSERT INTO top5(discipline) VALUES ('test3')");
            while(rs.next())   
            {
                result = rs.getString("discipline");
            }
            
            
            //DBConnector dbcon = new DBConnector();
            
            //String query = "Select * from member WHERE firstname = '"+mm.getfName()+"';";
            //stmt.executeUpdate("INSERT INTO top5(discipline) VALUES ('test')");
            //stmt.executeQuery("Select * from member WHERE firstname = '"+mm.getfName()+"' AND '"+mm.getAge()+";");
            //stmt.executeQuery("SELECT * FROM top5");
            //stmt.executeQuery("SELECT * FROM top5");
            Member m = new Member(mm.getfName(), mm.getLname(), mm.getAge(), mm.getTeam(), mm.getSex(), mm.getMembership(), mm.getActivePassive());
            c.createMember(m);
            assertEquals("test3", result);
            connection.rollback();
            connection.close();
            //stmt.executeQuery("DELETE FROM top5 WHERE discipline = 'test1'; ");
            
            
            
            //Member mem = new Member("", "", 0,"","","","");
            //Member expected = mem;
            //Member actual = m;
            
           // assertEquals(expected, actual);
       } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
       }
       }
        
  
    
    
}
