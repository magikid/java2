package finalproject;

import java.awt.event.*;
import javax.swing.*;

public class FinalProjectController {
    private final FinalProjectView view;
    private final UserColors colorMap;
    private String errorMessages;
    
    public FinalProjectController(FinalProjectView newView, UserColors providedMap){
        view = newView;
        colorMap = providedMap;
        view.setColorMap(colorMap);
    }
    
    public void go(){
        String instructions = "Add new colors using the form at the top.\n\nChange the colors by clicking a color on the left.";
        JOptionPane.showMessageDialog(null, instructions, "Instructions", JOptionPane.INFORMATION_MESSAGE);
        view.updateButtonActionListener((ActionEvent e) -> {
            handleButton();      
        });
    }
    
    private void handleButton(){
        if(!errors()){
            colorMap.addColor(view.getEnteredColorName(), view.getEnteredColorHex());
            view.generateColorLabels();
        }else{
            JOptionPane.showMessageDialog(null, errorMessages, "Error in form", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean errors(){
        String name = view.getEnteredColorName();
        String hex = view.getEnteredColorHex();
        
        boolean errors = false;
        errorMessages = "";
        
        if(hex.length() > 6){
            errors = true;
            errorMessages += "Color hex is too long\n";
        }
        
        if(hex.length() < 6){
            errors = true;
            errorMessages += "Color hex is too short\n";
        }        
        
        if (name.length()<1){
            errors = true;
            errorMessages += "Color name is too short\n";            
        }
        
        
        if(colorMap.hasHex(hex)){
            errors = true;
            errorMessages += "Already have color hex\n";
        }
        
        if(colorMap.hasColor(name)){
           errors = true;
           errorMessages += "Already have color name\n";
        }
        
        if(colorMap.length() > 19){
            errors = true;
            errorMessages += "Can't have more than 20 colors\n";
        }
        
        return errors;
    }
}
