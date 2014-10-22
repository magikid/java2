/*
 * 3 data fields
 * 2 constructors
 * 4 methods
 * UML 
 */
package cwj;

/**
 *
 * @author chrisj
 */
public class Dog {
    private String dogName;
    private int dogAge;
    private String dogGender;
    
    public Dog(String name) {
        dogName = name;
    }
    
    public Dog(String name, Integer age, String gender){
        dogName = name;
        dogAge = age;
        dogGender = gender;
    }
       
    public String name(){
        return dogName;
    }
    
    public int age(){
        return dogAge;
    }
    
    public static void main(String[] args){
        
    }
}