
package cwj;

public class Hybrid extends Automobile {
    protected int mpg;
    
    public Hybrid(){
        super();
        mpg = 50;
    }
    
    public int mpg(){
        return mpg;
    }
    
    public void mpg(int newMpg){
        mpg = newMpg;
    }
    
    @Override
    public String toString(){
        return super.toString("mpg: " + mpg);        
    }
}
