package learninheretance;

import java.util.Scanner;
import learninheretance.car.Car;
import learninheretance.toyota.Tesla;
import learninheretance.toyota.Toyota;

public class LearnInheretance {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter requerment");
   
        Car c = new Car();

        Toyota toyo = new Toyota();

        Tesla tes = new Tesla();

        tes.setAiDriving("AI is abailabl");
        System.out.println(tes.getAiDriving());

    }

}
