package learnmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;

public class LearnMethodOverloading {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many times you want put value.");
        int n = s.nextInt();
        
        int[] myArray = new int[n];
//
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number");
            int userInput = s.nextInt();
            myArray[i] = userInput;
        }
//        doSum(myArray);
//System.out.println(myArray);
 System.out.println(Arrays.toString(myArray));

    }
    
    
    public static int doSum(int... b){
    int sum=0;
   
    for(int item : b){
        sum+=item;
    }
//        System.out.println(sum);

return sum;
    }

//    public static int sum() {
//        return 10 + 20;
//    }
//
//    public static int sum(int a) {
//        return 10 + a;
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static void sum(int... a) {
//
//        int sum = 0;
//        for (int item : a) {
//           sum += item;
//        }
//
//        System.out.println(Arrays.toString(a));
//        System.out.println("Your Total is "+sum);
//
//    }
//    public static void sum(float... b) {
//
//        int sum = 0;
//        for (float item : b) {
//           sum += item;
//        }
//
//        System.out.println(Arrays.toString(a));
//        System.out.println("Your Total is "+sum);
//
//    }

}


//eiasinprodhan.github.io/#projects