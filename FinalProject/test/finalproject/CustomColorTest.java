package finalproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class CustomColorTest {

    public CustomColorTest() {
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

    @Test
    public void testAssign() {
        System.out.println("assign");
        String newColor = "";
        String newHex = "";
        CustomColor instance = new CustomColor();
        instance.assign(newColor, newHex);
        fail("The test case is a prototype.");
    }

    @Test
    public void testName_0args() {
        System.out.println("name");
        CustomColor instance = new CustomColor();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHex_0args() {
        System.out.println("hex");
        CustomColor instance = new CustomColor();
        String expResult = "";
        String result = instance.hex();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testName_String() {
        System.out.println("name");
        String newColorName = "";
        CustomColor instance = new CustomColor();
        instance.name(newColorName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHex_String() {
        System.out.println("hex");
        String newColorHex = "";
        CustomColor instance = new CustomColor();
        instance.hex(newColorHex);
        fail("The test case is a prototype.");
    }

}