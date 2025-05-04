
package testarrayandlinkedlist;


public class Vehicle {
 public  int speed;
   public  double regulerPrice;
   public  String color;
   public double getSalePrice;

    public Vehicle() {
    }

    public Vehicle(int speed, double regulerPrice, String color, double getSalePrice) {
        this.speed = speed;
        this.regulerPrice = regulerPrice;
        this.color = color;
        this.getSalePrice = getSalePrice;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegulerPrice() {
        return regulerPrice;
    }

    public void setRegulerPrice(double regulerPrice) {
        
      
        this.regulerPrice = regulerPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  double getGetSalePrice() {
        return getSalePrice;
    }

    public void setGetSalePrice(double getSalePrice) {
        
        
        this.getSalePrice = getSalePrice;
    }
   
   
    
    
    
}
