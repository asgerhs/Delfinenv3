/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinendel1.logic;

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
        Member m = new Member(mm.getfName(), mm.getLname(), mm.getAge(), mm.getTeam(), mm.getSex(), mm.getMembership(), mm.getActivePassive());
  
        c.createMember(m);
        Member mem = new Member("", "", 0,"","","","");
        Member expected = mem;
        Member actual = m;

        
        assertEquals(expected, actual);
        
        
  
    }
    
}
