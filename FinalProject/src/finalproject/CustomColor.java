package finalproject;

import java.util.*;

public class CustomColor {
    private String colorName;
    private String colorHex;
    
    public CustomColor(String firstColor, String firstHex){
        colorName = firstColor;
        colorHex = firstHex;
    }
    
    public CustomColor(){
        colorName = new String();
        colorHex = new String();
    }    
    
    public void assign(String newColor, String newHex){
        colorName = newColor;
        colorHex = newHex;
    }
    
    public String name(){
        return colorName;
    }
    
    public String hex(){
        return colorHex;
    }
    
    public void name(String newColorName){
        colorName = newColorName;
    }
    
    public void hex(String newColorHex){
        colorHex = newColorHex;
    }    
}
