package finalproject;

import java.util.*;

public class UserColors {
    
    // Gotta love generics
    private Map<String,String> colorMap;
    
    public UserColors(){
        colorMap = new HashMap<String,String>();
        
        // Add some defaults since there is a 5 color minimum
        this.addColor("White", "FFFFFF");
        this.addColor("Blue", "0000FF");
        this.addColor("Green", "00FF00");
        this.addColor("Red", "FF0000");
        this.addColor("Black", "000000");
    }
    
    public void addColor(String newName, String newHex){
        colorMap.put(newName, newHex);
    }
    
    public String getHex(String name){
        return colorMap.get(name);
    }
    
    public String getName(String hex){
        String results = "";
        
        for(String key: colorMap.keySet()){
            if(colorMap.get(key).equals(hex)){
                results = key;
            }
        }
        
        return results;
    }
    
    public String[] all(){
        String[] results = new String[colorMap.size()];
        int counter = 0;
        
        for(String key: colorMap.keySet()){
            results[counter] = key + " #" + colorMap.get(key);
            counter++;
        }
        
        return results;
    }
    
    public boolean hasHex(String testHex){
        return colorMap.containsValue(testHex);
    }
    
    public boolean hasColor(String testName){
        return colorMap.containsKey(testName);
    }
    
    public int length(){
        // I miss this ruby method
        return colorMap.size();
    }
            
}
