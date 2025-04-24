
package classsuperclasssubclass.circle;

import classsuperclasssubclass.geometric.GeometricObject;
import java.util.Date;


public class Rectangle extends GeometricObject{
    private double height;
   private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String color, boolean filled, Date dateCreated) {
        super(color, filled, dateCreated);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    
    
    
    public double getArea(){
    return Math.PI*Math.pow(width, height);
    }
    
    public double getParametar(){
    return 2*(height+width);
    }
    
    @Override
    public void setDateCreated(Date dateCreated) {
        super.setDateCreated(dateCreated); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setColor(String color) {
        super.setColor(color); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

        
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}';
    }
    
    
    
    
}
