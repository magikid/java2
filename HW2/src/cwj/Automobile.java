package cwj;

public class Automobile {
    protected String licensePlateNumber, color, condition;
    protected boolean isStarted, isForSale;
    
    public Automobile(){
        licensePlateNumber = "none";
        isStarted = false; 
        isForSale = false;
        color = "invisible";
        condition = "new";
    }
    
    public boolean isStarted(){
        return isStarted;
    }

    public void isStarted(boolean newIsStarted) {
        isStarted = newIsStarted;
    }
    
    public boolean isForSale(){
        return isForSale;
    }

    public void isForSale(boolean newIsForSale) {
        isForSale = newIsForSale;
    }    
    
    public String licensePlateNumber(){
        return licensePlateNumber;
    }

    public void licensePlateNumber(String newLicensePlate) {
        licensePlateNumber = newLicensePlate;
    }
    
    public String color(){
        return color;
    }
    
    public void color(String newColor){
        color = newColor;
    }
    
    public String condition(){
        return condition;
    }
    
    public void condition(String newCondition){
        condition = newCondition;
    }
    
    private String getBaseVariablesAsString(){
        String toReturn = "";
        toReturn += getClass().getName() + ": ";
        toReturn += isStarted ? "is started, " : "is not started, ";
        toReturn += isForSale ? "is for sale, " : "is not for sale, ";
        toReturn += "license plate: " + licensePlateNumber + ", ";
        toReturn += "color: " + color + ", ";
        toReturn += "condition: " + condition;
        return toReturn;
    }
    
    @Override
    public String toString(){
        return getBaseVariablesAsString();
    }
    
    public String toString(String otherData){
        String varsWithOtherData = getBaseVariablesAsString();
        varsWithOtherData += ", " + otherData;
        return varsWithOtherData;        
    }
}
