/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class AgeRecognition {
    private String fName;
    private String lName;
    private int age;
    
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
}
