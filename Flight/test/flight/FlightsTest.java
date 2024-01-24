/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package flight;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sugen
 */
public class FlightsTest {
    
    public FlightsTest() {
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
     * Test of bookASeat method, of class Flights.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flights instance = new Flights(112,"Toronto","Sri Lanka","03/02/99 7:50 pm",600,1000);;
        int expResult = 599;
        instance.bookASeat();
        int result = instance.numberOfSeatsLeft;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flights.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flights instance = new Flights(112,"Toronto","Sri Lanka","03/02/99 7:50 pm",600,1000);
        String expResult = "Flight 112, Toronto to Sri Lanka, 03/02/99 7:50 pm, Original price:1000.0$";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
