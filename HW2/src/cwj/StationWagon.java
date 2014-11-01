package cwj;

public class StationWagon extends Automobile {
    int trunkSize;
    
    public StationWagon(){
        super();
        trunkSize = 0;
    }
    
    public int trunkSize(){
        return trunkSize;
    }
    
    public void trunkSize(int newTrunkSize){
        trunkSize = newTrunkSize;
    }
}
