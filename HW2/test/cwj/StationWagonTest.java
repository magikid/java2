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
    
    @Test
    public void testToString(){
        genericStationWagon.condition("used");
        genericStationWagon.color("red");
        genericStationWagon.isForSale(false);
        genericStationWagon.isStarted(true);
        genericStationWagon.licensePlateNumber("GDG654");
        genericStationWagon.trunkSize(450);
        assertThat(genericStationWagon.toString(), is("cwj.StationWagon: is started, is not for sale, license plate: GDG654, color: red, condition: used, trunk size: 450"));
    }
}