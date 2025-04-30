
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
        
      System.out.println("-------------------");  
   double a=2;
  double result=Math.pow(2, 31)-1;
     System.out.println(result);
     System.out.println(Integer.MAX_VALUE);
     
     
     int i=10;
        while (i>10) {            
            i--;
                    System.out.println(i);
        }
 System.out.println(i);
        
        
    }
    
}
