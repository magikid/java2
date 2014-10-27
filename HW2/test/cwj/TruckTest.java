
package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TruckTest {
    Truck genericTruck;
    
    @Before
    public void setUp() {
        genericTruck = new Truck();
    }

    @Test
    public void testInheritence() {
        assertThat(genericTruck.isForSale(), is(false));
    }
    
    @Test
    public void testTruck(){
        assertThat(genericTruck.hasBoat(), is(true));
        
        genericTruck.hasBoat(false);
        assertThat(genericTruck.hasBoat(), is(false));
    }

}