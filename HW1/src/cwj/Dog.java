
package cwj;

/**
 * 
 * @author Chris Jones
 */
public class Dog {
    private String dogName;
    private int dogAge;
    private String dogGender;
    private boolean dogInCrate;
    
    public Dog(String name) {
        dogName = name;
    }
    
    public Dog(String name, int age, String gender){
        dogName = name;
        dogAge = age;
        dogGender = gender;
    }
       
    public String name(){
        return dogName;
    }
    
    public void name(String newname){
        dogName = newname;
    }
    
    public int age(){
        return dogAge;
    }
    
    public String gender(){
        return dogGender;
    }

    public String bark() {
        return "woof woof";
    }

    public void putInCrate() throws Exception {
        if(dogInCrate == false){
            dogInCrate = true;
        }else{
            throw new Exception("Dog already in crate.");
        }
            
    }

    public void releaseFromCrate() throws Exception {
        if(dogInCrate == true){
            dogInCrate = false;
        } else {
            throw new Exception("Dog not in crate.");
        }
    }
    
    public String pet(){
        return "*wags tail*";
    }
    
    public static void main(String[] args){
        
    }
}