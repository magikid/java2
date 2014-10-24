
package cwj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        assertEquals("Test create dog with name", "Fido", myDog.name());
    }

    @Test
    public void testDogOtherConstructor(){
        Dog secondDog = new Dog("Fido", 16, "male");
        assertEquals("Test Dog age", 16, secondDog.age());
        assertEquals("Test dog gender", "male", secondDog.gender());
    }
        
    @Test
    public void testBarkMethod(){
        assertEquals("Test barking", "woof woof", genericDog.bark());
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
    
}
