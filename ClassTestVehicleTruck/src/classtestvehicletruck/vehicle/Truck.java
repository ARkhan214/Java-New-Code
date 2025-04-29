
package classtestvehicletruck.vehicle;


public class Truck extends Vehicle{
    public int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regulerPrice, String color, double getSalePrice) {
        super(speed, regulerPrice, color, getSalePrice);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getGetSalePrice() {
           
//        double disPrice=0.1;
//       double result=0;
        if (weight>2000) {      

//          return regulerPrice-(regulerPrice*0.10);
          return getRegulerPrice()-(getRegulerPrice()*0.1);
         
        }
        else{
         return regulerPrice; }
    }   

    
    
//    @Override
//    public String toString() {
//        
//        return "Truck{" + "weight=" + regulerPrice + '}';
//        
//    }
        
    
    
        
}
