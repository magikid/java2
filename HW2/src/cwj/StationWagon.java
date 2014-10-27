package cwj;

public class StationWagon extends Automobile {
    int trunkSize;
    
    public StationWagon(){
        super();
    }
    
    public int trunkSize(){
        return trunkSize;
    }
    
    public void trunkSize(int newTrunkSize){
        trunkSize = newTrunkSize;
    }
}
