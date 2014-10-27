package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StationWagonTest {

    StationWagon genericStationWagon;
    
    @Before
    public void setUp() {
        genericStationWagon = new StationWagon();
    }

    @Test
    public void testStationWagon() {
        assertThat(genericStationWagon.trunkSize(), is(0));
        
        genericStationWagon.trunkSize(450);
        assertThat(genericStationWagon.trunkSize(), is(450));
    }
    
    @Test
    public void testInheritence(){
        assertThat(genericStationWagon.condition(), is("new"));
    }

}