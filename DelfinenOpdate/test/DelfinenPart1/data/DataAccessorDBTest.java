/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelfinenPart1.data;

import delfinendel1.logic.Member;
import delfinendel1.logic.competitiveMember;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
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
public class DataAccessorDBTest {

    private DBConnector connector = null;
    private Connection connection;
    private DataAccessorDB da = null;

    public DataAccessorDBTest() {

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
     * Test of getMembers method, of class DataAccessorDB.
     */
    @Test
    public void testGetMembers() {

        List<Member> members = da.getMembers();
        assertNotNull(members);

        int expected = 7;
        int actual = members.size();

        assertEquals(expected, actual);
    }
}
