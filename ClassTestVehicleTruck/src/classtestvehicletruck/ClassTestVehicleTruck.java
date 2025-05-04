package classtestvehicletruck;

import classtestvehicletruck.vehicle.Truck;
import classtestvehicletruck.vehicle.Vehicle;
import java.util.Arrays;

public class ClassTestVehicleTruck {

    public static void main(String[] args) {

        Truck t = new Truck();

        t.setRegulerPrice(5000);

        System.out.println("Reguler Price is: "+t.regulerPrice+" Taka");

        t.setWeight(2000);

        System.out.println("Your Bill is: "+t.getGetSalePrice()+" Taka");

        System.out.println("-------------------");

    }
}
