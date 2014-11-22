/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p2;

import p2.AgeRecognition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class AgeRecognitionTest {
    AgeRecognition instance;

    @Before
    public void setUp() {
        instance = new AgeRecognition();
    }

    @Test
    public void testFName() {
        String expResult = null;
        String result = instance.fName();
        assertEquals(expResult, result);
    }

    @Test
    public void testFName_String() {
        String newFirstName = "Chris";
        instance.fName(newFirstName);
        assertEquals(newFirstName, instance.fName());
    }

    @Test
    public void testLName() {
        String expResult = null;
        String result = instance.lName();
        assertEquals(expResult, result);
    }

    @Test
    public void testLName_String() {
        String newLastName = "Jones";
        instance.lName(newLastName);
        assertEquals("Jones", instance.lName());
    }

    @Test
    public void testAge() {
        int expResult = 0;
        int result = instance.age();
        assertEquals(expResult, result);
    }

    @Test
    public void testAge_int() {
        int newAge = 44;
        instance.age(newAge);
        assertEquals(44, instance.age());
    }
    
    @Test
    public void testGender() {
        
        assertFalse(instance.gender());
        instance.gender(true);
        assertTrue(instance.gender());
    }
    
    @Test
    public void testStateOfBirth(){
        assertEquals(null, instance.stateOfBirth());
        instance.stateOfBirth("IN");
        assertEquals("IN", instance.stateOfBirth());
    }
}