
package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class VanTest {

    Van genericVan;
    
    @Before
    public void setUp() {
        genericVan = new Van();
    }

    @Test
    public void testInheritence() {
        assertThat(genericVan.isForSale(), is(false));
    }
    
    @Test
    public void testVan(){
        assertThat(genericVan.paintedSides(), is(false));
        
        genericVan.paintedSides(true);
        assertThat(genericVan.paintedSides(), is(true));
    }
    
    @Test
    public void testToString(){
        genericVan.condition("used");
        genericVan.color("red");
        genericVan.isForSale(false);
        genericVan.isStarted(true);
        genericVan.licensePlateNumber("GDG654");
        genericVan.paintedSides(false);
        assertThat(genericVan.toString(), is("cwj.Van: is started, is not for sale, license plate: GDG654, color: red, condition: used, does not have painted sides"));
    }

}