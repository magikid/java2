
package cwj;

public class finalTestOfAllClasses {
    
    public static void main(String[] args){
        Automobile car = new Automobile();
        Hybrid prius = new Hybrid();
        StationWagon volvo = new StationWagon();
        Truck ford = new Truck();
        Van minivan = new Van();
        
        minivan.isStarted(true);
        ford.isStarted(true);
        ford.isForSale(true);
        volvo.isForSale(true);
        
        System.out.println(car);
        System.out.println(prius);
        System.out.println(volvo);
        System.out.println(ford);
        System.out.println(minivan);
    }
}
