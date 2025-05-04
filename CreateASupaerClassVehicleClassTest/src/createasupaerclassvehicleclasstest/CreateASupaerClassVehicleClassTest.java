package createasupaerclassvehicleclasstest;

import createasupaerclassvehicleclasstest.vehicle.Bike;
import createasupaerclassvehicleclasstest.vehicle.Car;

public class CreateASupaerClassVehicleClassTest {

    public static void main(String[] args) {

        Car c = new Car(2, "Toyota", 250);
        c.displayDetail();

        System.out.println("-------------------");

        Bike b = new Bike("Yes", "Bajaj", 150);
        b.displayDetail();

    }

}
