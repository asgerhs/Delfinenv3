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
 * @author Frederik L.
 */
public class ControllerTest {

    private Controller c;
    private Member mm;

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
    public void testCreateMember() {

        try {

            String result = "";
            String query = "SELECT * FROM member; ";
            DBConnector cc = new DBConnector();
            Connection connection = cc.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            connection.setAutoCommit(false);

            Member actmem = null;
            String fname = "";
            String lname = "";
            int age = 0;
            String team = "";
            String sex = "";
            String membership = "";
            String activity = "";

            while (rs.next()) {
                fname = rs.getString("firstname");
                lname = rs.getString("lastname");
                age = Integer.parseInt(rs.getString("age"));
                team = rs.getString("team");
                sex = rs.getString("sex");
                membership = rs.getString("membership");
                activity = rs.getString("activity");
                actmem = new Member(fname, lname, age, team, sex, membership, activity);
            }

            Member expmem = new Member(mm.getfName(), mm.getLname(), mm.getAge(), mm.getTeam(), mm.getSex(), mm.getMembership(), mm.getActivePassive());
            c.createMember(expmem);
            connection.rollback();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
