
package learninheretance.car;



public class Car{
    int price;
    String engine;
    String brakes;
    String tires;

    public Car() {
    }

    public Car(int price, String engine, String brakes, String tires) {
        this.price = price;
        this.engine = engine;
        this.brakes = brakes;
        this.tires = tires;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBrakes() {
        return brakes;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" + "price=" + price + ", engine=" + engine + ", brakes=" + brakes + ", tires=" + tires + '}';
    }
    
    
    
    
}
