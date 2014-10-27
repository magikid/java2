package cwj;

public class Automobile {
    protected String licensePlateNumber, color, condition;
    protected boolean isStarted, isForSale;
    
    public Automobile(){
        licensePlateNumber = "";
        isStarted = false; 
        isForSale = false;
        color = "";
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
}
