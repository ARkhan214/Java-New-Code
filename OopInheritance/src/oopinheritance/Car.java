
package oopinheritance;


public class Car extends Vehicle{
    public String brand;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String engin, String drivingSit) {
        super(engin, drivingSit);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" + "Brand= " + brand +" "+"Engin= "+super.getEngin()+" "+"Driving Sit= "+super.getDrivingSit()+ '}';
    }
    
    
    
    
    
    
}
