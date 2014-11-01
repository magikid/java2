
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
    
    @Override
    public String toString(){
        return super.toString(hasBoat ? "has a boat" : "does not have a boat");
    }
}
