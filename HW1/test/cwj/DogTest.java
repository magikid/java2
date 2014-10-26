
package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DogTest {
    
    private Dog genericDog;
    
    public DogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        genericDog = new Dog("Fido", 7, "male");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDogNameConstructor() {
        Dog myDog = new Dog("Fido");
        assertThat(myDog.name(), is("Fido"));
    }

    @Test
    public void testDogOtherConstructor(){
        Dog secondDog = new Dog("Fido", 16, "male");
        assertThat(secondDog.age(), is(16));
        assertThat(secondDog.gender(), is("male"));
    }
        
    @Test
    public void testBarkMethod(){
        assertThat(genericDog.bark(), is("woof woof"));
    }
    
    @Test
    public void testPutInCrate(){
        boolean thrown = false;
        try{
            genericDog.putInCrate();
        } catch (Exception e){
            thrown = true;
        }
        
        assertFalse(thrown);
    }
    
    @Test
    public void testDogAlreadyInCrate(){
        boolean thrown = false;
        
        try{
            genericDog.putInCrate();
            genericDog.putInCrate();
        } catch (Exception e){
            thrown = true;
        }
        
        assertTrue(thrown);
    }
    
    @Test
    public void testLetOutOfCrate(){
        boolean thrown = false;
        
        try{
            genericDog.putInCrate();
            genericDog.releaseFromCrate();
        } catch (Exception e){
            thrown = true;
        }
        
        assertFalse(thrown);

    }
    
    @Test
    public void testDogAlreadyOutOfCrate(){
        boolean thrown = false;
        
        try{
            genericDog.releaseFromCrate();
        } catch (Exception e){
            thrown = true;
        }
        
        assertTrue(thrown);
    }
    
    @Test
    public void testGiveTreat(){
        assertThat(genericDog.pet(), is("*wags tail*"));
    }
    
    @Test
    public void testRenameDog(){
        genericDog.name("Archer");
        assertThat(genericDog.name(), is("Archer"));
    }
}
