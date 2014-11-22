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
public class HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              //fetch student record based on his roll no from the database
      AgeRecognition model  = new AgeRecognition();

      //Create a view : to write student details on console
      AgeRecognitionView view = new AgeRecognitionView("HW3: Age Recognition");

      AgeRecongnitionController controller = new AgeRecongnitionController(model, view);

      controller.go();
      
    }
    
}
