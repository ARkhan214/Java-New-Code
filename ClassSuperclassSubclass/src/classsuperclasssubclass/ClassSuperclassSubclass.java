package classsuperclasssubclass;

import classsuperclasssubclass.circle.Circle;
import classsuperclasssubclass.circle.Rectangle;
import classsuperclasssubclass.geometric.GeometricObject;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ClassSuperclassSubclass {

    public static void main(String[] args) {
        GeometricObject g = new GeometricObject();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        
        ArrayList<Circle> geo=new ArrayList<Circle>();
       
        
        
        
        Rectangle y=new Rectangle();        
        System.out.println(y.equals(r));
        System.out.println("-----------------------------");
        

        c.setRadious(5);
        System.out.println("Perimeter Of Circle is:   "+c.getPerimeter());
        System.out.println("------------1---------");

        r.setHeight(5);
        r.setWidth(7);
        System.out.println("Perimeter of Rectangle is:   "+r.getParametar());
        System.out.println("-----------2-------------");       
        r.setFilled(false);
        System.out.println("Fild is:   "+r.isFilled());
        System.out.println("------------3----------------");
       
                       
        
        c.setDateCreated(Date.from(Instant.now()));
        System.out.println("Date is:   "+c.getDateCreated());
        System.out.println("--------4--------------------");
        

        r.setDateCreated(Date.from(Instant.now()));
        System.out.println("Date is:   "+r.getDateCreated());
        System.out.println("-----------5-----------------");

        r.setColor("Blue");
        System.out.println("Rectangle Color is:   "+r.getColor());
        System.out.println("-----------6-----------------");

        
        
        c.setColor("Green");
        System.out.println("Circle Color is:   "+c.getColor());
        System.out.println("-----------7-----------------");
        //private double height;
        //private double width;
        // private double radious;
        //  private String color; 
        //private boolean filled;
        //private Date dateCreated;
    }

}
