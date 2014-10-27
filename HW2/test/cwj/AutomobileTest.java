
package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AutomobileTest {
    
    Automobile a;
    
    public AutomobileTest() {
    }
    
    @Before
    public void setUp() {
        a = new Automobile();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNewAutomobile() {   
        assertTrue(a instanceof Automobile);
    }
    
    @Test
    public void testIsStarted(){
        assertThat(a.isStarted(), is(false));
        
        a.isStarted(true);
        assertTrue(a.isStarted());
    }
    
    @Test
    public void testIsForSale(){
        assertThat(a.isForSale(), is(false));
        
        a.isForSale(true);
        assertTrue(a.isForSale());
    }
    
    @Test
    public void testLicensePlateNumber(){
        assertThat(a.licensePlateNumber(), is(""));
        
        a.licensePlateNumber("GDG654");
        assertThat(a.licensePlateNumber(), is("GDG654"));
    }
    
    @Test
    public void testColor(){
        assertThat(a.color(), is(""));
        
        a.color("blue");
        assertThat(a.color(), is("blue"));
    }
    
    @Test
    public void testCondition(){
        assertThat(a.condition(), is("new"));
        
        a.condition("used");
        assertThat(a.condition(), is("used"));
    }
    
    
}
