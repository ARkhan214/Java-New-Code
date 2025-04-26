package homework;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
//Even or Odd

// Scanner input=new Scanner(System.in);
//        System.out.println("Enter Number");
//        float number=input.nextFloat();
//        if (number%2==0) {
//            System.out.println(number+" is Even Number");
//        }
//        else{System.out.println(number+" is Odd Number.");}

// Posative Negative or Zero

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Number");
//        float number = input.nextFloat();
//        if (number>0) {
//            System.out.println(number+" Is a posative number");   
//        }
//            else if (number<0) {
//    System.out.println(number+" Is a negative number");
//        }
//         else{
//            System.out.println("It's zero");}

// Vowel and Consonant 

//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Letter ");
//       
//        char letter = input.next().toUpperCase().charAt(0);
//       
//        if(letter == 'A' || letter == 'E' || letter== 'I' || letter== 'O'|| letter=='U'){
//            System.out.println(letter+ " is a Vowel. ");
//        }
//        else if(letter>= 'A' && letter<= 'Z') {
//            System.out.println(letter+ " is a Consonant. ");
//        }
//        else {
//       
//            System.out.println("This is not Valid Letter. ");
//        }  

//Greatest Number

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter First Number ");
//        float firstValue = input.nextFloat();
//
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Enter Second Number ");
//        float secondValue = input2.nextFloat();
//
//        if (firstValue > secondValue) {
//            System.out.println(firstValue + " Is Greatest");
//
//        } 
//        
//        else {
//            System.out.println(secondValue + " Is Greatest");
//        }

//    leap year

//Scanner input = new Scanner(System.in);
// System.out.println("Enter First Number ");       
//   float firstValue = input.nextFloat();
//   
//   
//     if (firstValue % 4 == 0) {
//            if (firstValue % 100 == 0) {
//                if (firstValue % 400 == 0) {
//                    System.out.println(firstValue+" is Leap Year");
//                }
//                else {
//                    System.out.println(firstValue+" is not Leap Year");
//                }
//            }
//            else {
//                System.out.println(firstValue+" is Leap Year");
//            }
//        }
//        else {
//            System.out.println(firstValue+" is Not Leap Year");
//        }


Scanner input = new Scanner(System.in);
 System.out.println("Enter First Number ");       
   int marks = input.nextInt();
if(marks>100){
                System.out.println("Invalid");
    
            }
           else  if(marks>89){
                System.out.println(marks+" A Grade");
    
            }
           else  if(marks>79){
    System.out.println(marks+" B Gread");    
            }
           else  if(marks>69){
    System.out.println(marks+" C Grade");    
            }
            else if(marks>59){
    System.out.println(marks+" D Grade");    
            }
            else{
    System.out.println(marks+" Fail");            }



    }

}
