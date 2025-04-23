
package learninheretance.toyota;

import learninheretance.car.Car;


public class Tesla extends Car{
    String aiDriving;
    String electricFasility;
    String battary;

    public Tesla() {
    }

    public Tesla(String aiDriving, String electricFasility, String battary) {
        this.aiDriving = aiDriving;
        this.electricFasility = electricFasility;
        this.battary = battary;
    }

    public Tesla(String aiDriving, String electricFasility, String battary, int price, String engine, String brakes, String tires) {
        super(price, engine, brakes, tires);
        this.aiDriving = aiDriving;
        this.electricFasility = electricFasility;
        this.battary = battary;
    }

    public String getAiDriving() {
        return aiDriving;
    }

    public void setAiDriving(String aiDriving) {
        this.aiDriving = aiDriving;
    }

    public String getElectricFasility() {
        return electricFasility;
    }

    public void setElectricFasility(String electricFasility) {
        this.electricFasility = electricFasility;
    }

    public String getBattary() {
        return battary;
    }

    public void setBattary(String battary) {
        this.battary = battary;
    }

    @Override
    public String toString() {
        return "Tesla{" + "aiDriving=" + aiDriving + ", electricFasility=" + electricFasility + ", battary=" + battary + '}';
    }
    
    
    
    
}
