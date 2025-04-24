
package classsuperclasssubclass.circle;

import classsuperclasssubclass.geometric.GeometricObject;
import java.util.Date;


public class Circle extends GeometricObject{
   private double radious;

    public Circle() {
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(double radious, String color, boolean filled, Date dateCreated) {
        super(color, filled, dateCreated);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    
     public double getArea() {

        return Math.PI * Math.pow(radious, 2);
    }

    public double getPerimeter() {

        return 2 * Math.PI * radious;
    }

    public double getDiameter() {

        return 2 * radious;
    }
            
        
    
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated()
                + " and the radious is " + radious);
    }
    
    
    
    

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + '}';
    }
    
    
    
}
