
package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AutomobileTest {
    
    Automobile genericAutomobile;
    
    public AutomobileTest() {
    }
    
    @Before
    public void setUp() {
        genericAutomobile = new Automobile();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNewAutomobile() {   
        assertTrue(genericAutomobile instanceof Automobile);
    }
    
    @Test
    public void testIsStarted(){
        assertThat(genericAutomobile.isStarted(), is(false));
        
        genericAutomobile.isStarted(true);
        assertTrue(genericAutomobile.isStarted());
    }
    
    @Test
    public void testIsForSale(){
        assertThat(genericAutomobile.isForSale(), is(false));
        
        genericAutomobile.isForSale(true);
        assertTrue(genericAutomobile.isForSale());
    }
    
    @Test
    public void testLicensePlateNumber(){
        assertThat(genericAutomobile.licensePlateNumber(), is(""));
        
        genericAutomobile.licensePlateNumber("GDG654");
        assertThat(genericAutomobile.licensePlateNumber(), is("GDG654"));
    }
    
    @Test
    public void testColor(){
        assertThat(genericAutomobile.color(), is(""));
        
        genericAutomobile.color("blue");
        assertThat(genericAutomobile.color(), is("blue"));
    }
    
    @Test
    public void testCondition(){
        assertThat(genericAutomobile.condition(), is("new"));
        
        genericAutomobile.condition("used");
        assertThat(genericAutomobile.condition(), is("used"));
    }
    
    @Test
    public void testToString(){
        genericAutomobile.condition("used");
        genericAutomobile.color("red");
        genericAutomobile.isForSale(false);
        genericAutomobile.isStarted(true);
        genericAutomobile.licensePlateNumber("GDG654");
        assertThat(genericAutomobile.toString(), is("cwj.Automobile: is started, is not for sale, license plate: GDG654, color: red, condition: used"));
    }

    @Test
    public void testToStringParam(){
        genericAutomobile.condition("used");
        genericAutomobile.color("red");
        genericAutomobile.isForSale(false);
        genericAutomobile.isStarted(true);
        genericAutomobile.licensePlateNumber("GDG654");
        assertThat(genericAutomobile.toString("other: none"), is("cwj.Automobile: is started, is not for sale, license plate: GDG654, color: red, condition: used, other: none"));
    }
}
