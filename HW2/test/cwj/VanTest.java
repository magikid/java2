
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

}