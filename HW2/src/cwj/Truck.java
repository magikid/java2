
package cwj;

public class Truck extends Automobile{
    boolean hasBoat;
    
    public Truck(){
        super();
        hasBoat = true;
    }
    
    public boolean hasBoat(){
        return hasBoat;
    }
    
    public void hasBoat(boolean newHasBoat){
        hasBoat = newHasBoat;
    }
}
