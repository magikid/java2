package finalproject;

import java.util.*;

public class CustomColor {
    private Map<String, String> colors = new HashMap<String, String>();
    
    public CustomColor(HashMap<String, String> defaultHm){
        colors.putAll(defaultHm);
    }    
    
    public void assign(String newColor, String newHex){
        if(!colors.containsValue(newHex)){
            colors.put(newColor, newHex);
        }
    }
}
