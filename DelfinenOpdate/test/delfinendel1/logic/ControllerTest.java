/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinendel1.logic;

import DelfinenPart1.data.DBConnector;
import DelfinenPart1.data.DataAccessorDB;
import java.sql.Connection;
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
    private DBConnector connector;
    
    
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
            Connection connection = connector.getConnection();
            Statement stmt = connection.createStatement();
            connection.setAutoCommit(false);
            
            //DBConnector dbcon = new DBConnector();
            
            //String query = "Select * from member WHERE firstname = '"+mm.getfName()+"';";
            stmt.executeUpdate("INSERT INTO top5(discipline) VALUES ('test1')");
            //stmt.executeQuery("Select * from member WHERE firstname = '"+mm.getfName()+"' AND '"+mm.getAge()+";");
            stmt.executeQuery("SELECT * FROM top5");
            
            //dbcon.("1", "one");
            
            assertEquals("test1", stmt.executeQuery("SELECT * FROM top5"));
            
            stmt.executeQuery("DELETE FROM top5 where discipline = 'test1");
           // Member m = new Member(mm.getfName(), mm.getLname(), mm.getAge(), mm.getTeam(), mm.getSex(), mm.getMembership(), mm.getActivePassive());
            
            //c.createMember(m);
            //Member mem = new Member("", "", 0,"","","","");
            //Member expected = mem;
            //Member actual = m;
            
           // assertEquals(expected, actual);
       } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
       }
       }
        
  
    
    
}
