/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class AgeRecongnitionController {
    private AgeRecognition model;
    private AgeRecognitionView view;
    
    public AgeRecongnitionController(AgeRecognition m, AgeRecognitionView v){
        model = m;
        view = v;
    }
    
    public void go(){
        view.updateActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                handleButton();
            }            
        });
    }
    
    private void handleButton(){
        String message;

        model.fName(view.getEnteredFname());
        model.lName(view.getEnteredLname());
        model.age(view.getEnteredAge());

        message = "User Login: " + model.lName() + ", " + model.fName() + "<br>";

        if (model.age() < 12) {      
            message += "Hello child";
        } else if (model.age() >= 12 && model.age() < 18) {
            message += "Hi teen";
        } else if (model.age() >= 18 && model.age() < 35) {
            message += "Welcome young adult";
        } else if (model.age() >= 35 && model.age() < 65) {
            message += "Howdy midlifer";
        } else if (model.age() >= 65) {
            message += "How are you retiree?";
        }

        view.provideResponse(message);   
    }
}