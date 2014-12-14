package finalproject;

import java.util.*;

public class UserColors {
    
    private Map<String,String> colorMap;
    
    public UserColors(){
        colorMap = new HashMap<String,String>();
        
        //Set some defaults
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
        for(String key: colorMap.keySet()){
            if(colorMap.get(key).equals(hex)){
                return key;
            }
        }
        
        return "";
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
        return colorMap.size();
    }
            
}
