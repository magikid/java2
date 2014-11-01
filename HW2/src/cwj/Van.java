
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

    @Override
    public String toString(){
        return super.toString(paintedSides ? "has painted sides" : "does not have painted sides");
    }    
}
