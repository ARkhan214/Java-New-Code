package createasupaerclassvehicleclasstest.vehicle;

public class Bike extends Vehicle {

    public String hasCarrier;

    public Bike() {
    }

    public Bike(String hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(String hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public String getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(String hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Carier: " + hasCarrier);
    }

//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
}
