
package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class HybridTest {
    
    Hybrid genericHybrid;
    
    public HybridTest() {
    }
    
    @Before
    public void setUp() {
        genericHybrid = new Hybrid();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMPG() {
        assertThat(genericHybrid.mpg(), is(50));
        
        genericHybrid.mpg(65);
        assertThat(genericHybrid.mpg(), is(65));
    }
    
    @Test
    public void testInheritence(){
        genericHybrid.color("red");
        assertThat(genericHybrid.color(), is("red"));
    }
    
}
