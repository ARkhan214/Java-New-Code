
package classtestvehicletruck;

import classtestvehicletruck.vehicle.Truck;
import classtestvehicletruck.vehicle.Vehicle;
import java.util.Arrays;


public class ClassTestVehicleTruck {

    public static void main(String[] args) {
        
      //  Vehicle v=new Vehicle();
        Truck t=new Truck();
        
        t.setRegulerPrice(5000);
        
        
        System.out.println(t.regulerPrice);
        
        t.setWeight(2200);
        
//        t.getGetSalePrice();
        System.out.println(t.getGetSalePrice());
    
        
        
        
    }
    
}
