
package p2;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 * 
 */
public class AgeRecognition {
    private String fName;
    private String lName;
    private int age;
    private String stateOfBirth;
    private boolean gender;
    
    public String fName(){
        return fName;
    }
    
    public void fName(String newFirstName){
        fName = newFirstName;
    }
    
    public String lName(){
        return lName;
    }
    
    public void lName(String newLastName){
        lName = newLastName;
    }
    
    public int age(){
        return age;
    }
    
    public void age(int newAge){
        age = newAge;
    }

    public void gender(boolean b) {
        gender = b;
    }

    public boolean gender() {
        return gender;
    }

    public void stateOfBirth(String in) {
        stateOfBirth = in;
    }

    public String stateOfBirth() {
        return stateOfBirth;
    }
}
