package useofifelse;

import java.util.Scanner;

public class UseOfIfElse {

    public static void main(String[] args) {
//        Scanner n=new Scanner(System.in);
//        
//        System.out.println("Enter Radius");
//        
//        float radius=n.nextFloat();
//        
//        if (radius<=0) {
////            System.out.println("Radius must be greaterthan zero Enter Radius Again");
//            System.err.println("Radius must be greaterthan zero");
//            System.out.println("Enter Radius Again");
//            float newRadius=n.nextFloat();
////            double result=Math.PI*Math.pow(newRadius, 2);
//            System.out.println("Radious is "+Math.PI*Math.pow(newRadius, 2));
//        }
//        else{
//        double result1=Math.PI*Math.pow(radius, 2);
//            System.out.println("Radius is "+result1);
//        }
//

        Scanner n = new Scanner(System.in);

        System.out.println("Enter Radius");
        float radius = n.nextFloat();

        if (radius >= 1) {
            System.out.println("Circle area is " + (double) Math.PI * Math.pow(radius, 2));
        } else {
            System.out.println("Radius must be greaterthan zero Enter Radius Again");
            float newRadius = n.nextFloat();
            System.out.println("Circle area is " + Math.PI * Math.pow(newRadius, 2));
        }

    }

}
