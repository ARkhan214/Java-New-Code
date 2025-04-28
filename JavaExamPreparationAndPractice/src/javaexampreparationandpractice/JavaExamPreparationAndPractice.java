package javaexampreparationandpractice;

import java.util.Arrays;
import java.util.Scanner;

public class JavaExamPreparationAndPractice {

    public static void main(String[] args) {
        //Fibonacci Calculate using array
        Scanner j=new Scanner(System.in);
        
        System.out.println("Enter number to check Fibonacci");
        int input=j.nextInt();
        
        int[] myArray=new int[input];
            myArray[0]=0;
            myArray[1]=1;
            
            for (int i = 2; i < myArray.length; i++) {
            
        }
        
        
        
        
        
        
        //factorial
//          Scanner n=new Scanner(System.in);
//        
//        System.out.println("Enter numbar to Check factorial");
//        int input=n.nextInt();
//        
//        int factorial=1;//1,2,6,24,120,720
//      
//                    //1,2,3,4,5,6
//        for (int i = 1; i <= input; i++) {
//            factorial *= i;//1,2,3,4,5,6
//            //1,2,6,24,120,720
//        }
//        System.out.println("Factorial is "+factorial);
        
        
        
        
        
        
        
        
        
        //bubble sort
//        Scanner n=new Scanner(System.in);
//        
//        System.out.println("Enter size of numbar");
//        int input=n.nextInt();
//        
//        int[] myArrays=new int[input];
//        
//        //Array value input part.
//        for (int i = 0; i < myArrays.length; i++) {
//            System.out.println("Enter Value "+(i+1));
//            int value=n.nextInt();
//            myArrays[i]=value;
//            
//        }
//        
//        //sort part
//        for (int round = 0; round < myArrays.length-1; round++) {
//            for (int step = 0; step < myArrays.length-1-round; step++) {
//                if (myArrays[step]>myArrays[step+1]) {
//                    int smallValue=myArrays[step+1];
//                    myArrays[step+1]=myArrays[step];
//                    myArrays[step]=smallValue;
//                }
//                
//            }
//        }
//        System.out.println("Bubble "
//                + "sort Value is "+Arrays.toString(myArrays));
        
        
        
        
        
        
        
        //Bubble Sort
//        Scanner n = new Scanner(System.in);
//
//        System.out.println("Enter size of input");
//        int size = n.nextInt();
//
//        int[] myArray = new int[size];
//
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Enter value " + (i + 1));
//            int input = n.nextInt();
//            myArray[i] = input;
//
//        }
//
////        System.out.println(Arrays.toString(myArray));
//
//        for (int round = 0; round < myArray.length - 1; round++) {
//            for (int step = 0; step < myArray.length - round - 1; step++) {
//
//                if (myArray[step] > myArray[step + 1]) {
//
//                    int temp = myArray[step + 1];
//                    myArray[step + 1] = myArray[step];
//                    myArray[step] = temp;
//                }
//
//            }
//
//        }
//
//        System.out.println("Bubble sort is "+Arrays.toString(myArray));

        //Prime number
//        Scanner n=new Scanner(System.in);
//        
//        System.out.println("Enter number");
//        int input =n.nextInt();
//        
//        int count=0;
//                
//        for (int i = 1; i <=input; i++) {
//            if (input % i==0) {
//                count++;
//            }
//        }
//        
//        if (count==2) {
//            System.out.println("This is a prime number.");
//        }
//        else{System.out.println("This is not a prime number");}





        //Prime number
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter number to Check Prime number");
//        int userNumber = s.nextInt();
//
//        int count = 0;
//
//        if (userNumber < 0) {
//            System.out.println(userNumber + " is negative a number.Please Enter posative negative");
//        }
//
//        if (userNumber > 1) {
//
//            for (int i = 1; i <= userNumber; i++) {
//                if (userNumber % i == 0) {
//                    count++;
//
//                }
//
//            }
//            if (count == 2) {
//                System.out.println(userNumber + " is a prime number");
//
//            } else {
//                System.out.println(userNumber + " is a not prime number");
//            }
//
//        }
//
//        if (userNumber == 0 || userNumber == 1) {
//            System.out.println(userNumber + " Neither prime nor composite");
//
//        }
//lsat two braket.
    }

}
