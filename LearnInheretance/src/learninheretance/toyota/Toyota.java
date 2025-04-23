
package learninheretance.toyota;

import learninheretance.car.Car;


public class Toyota extends Car{
    String lowPrice;
    String sit;

    public Toyota() {
    }

    public Toyota(String lowPrice, String sit) {
        this.lowPrice = lowPrice;
        this.sit = sit;
    }

    public Toyota(String lowPrice, String sit, int price, String engine, String brakes, String tires) {
        super(price, engine, brakes, tires);
        this.lowPrice = lowPrice;
        this.sit = sit;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getSit() {
        return sit;
    }

    public void setSit(String sit) {
        this.sit = sit;
    }

    @Override
    public String toString() {
        return "Toyota{" + "lowPrice=" + lowPrice + ", sit=" + sit + '}';
    }
    
    
    
}
