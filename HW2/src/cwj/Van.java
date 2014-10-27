
package cwj;

public class Van extends Automobile {
    boolean paintedSides;
    
    public Van(){
        super();
        paintedSides = false;
    }
    
    public boolean paintedSides(){
        return paintedSides;
    }
    
    public void paintedSides(boolean newPaintedSides){
        paintedSides = newPaintedSides;
    }
}
