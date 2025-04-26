package classtest;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ClassTest {

    public static void main(String[] args) {
        //Bubble Sort
        
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter Array Size ");
//        int size = s.nextInt();
//
//        int[] myArray = new int[size];
//
//        for (int index = 0; index < myArray.length; index++) {
//            System.out.println("Enter value " + (index + 1));
//            int userInput = s.nextInt();
//            myArray[index] = userInput;
//
//        }
//        System.out.println("------------------------------");
//        System.out.println("Before Sorting " + Arrays.toString(myArray));
//
//        for (int round = 0; round < myArray.length - 1; round++) {
//            for (int step = 0; step < myArray.length - round - 1; step++) {
//                if (myArray[step] > myArray[step + 1]) {
//                    int temp = myArray[step];
//                    myArray[step] = myArray[step + 1];
//                    myArray[step + 1] = temp;
//
//                }
//            }
//        }
//
//        System.out.println("After Sorting " + Arrays.toString(myArray));
        
        
        
        
        
        
        
        //prime number
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter number ");
//        int input = s.nextInt();
//
//        int count = 0;
//
//        for (int i = 1; i <= input; i++) {
//            if (input % i == 0) {
//                count++;
//            }
//        }
//
//        if (count == 2) {
//            System.out.println(input + " it is Prime Number ");
//        } else {
//            System.out.println(input + " it is Not Prime Number ");
//
//        }
        
        
        
        
        //Factorial
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter number");
//        int input = s.nextInt();
//        int factorial = 1;
//
//        for (int i = 1; i <= input; i++) {
//            factorial *= i;
//        }
//
//        System.out.println("Factorial of " + input + " is " + factorial);





        //Fibonacci
        
//         Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter limit :");
//        int size = s.nextInt();
//        System.out.println("-------------------------------");
//        
//        int number1=0;
//        int number2=1;
//        int sum=0;
//        System.out.println(number1);
//        System.out.println(number2);
//        
//        for(int i=3; i<=size; i++){
//            sum= number1+number2;
//            System.out.println(sum);
//            
//            number1 = number2;
//            number2 = sum;        
//        } 





        





                        //max min
        
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter How Many Number Do You Want To Compare: ");
//        int size = s.nextInt();
//
//        int[] arrays = new int[size];
//
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println("Enter array value " + (i + 1));
//            int input = s.nextByte();
//            arrays[i] = input;
//        }
//        int maxNumber = arrays[0];
//        int minNumber = arrays[0];
//
//        for (int number : arrays) {
//            if (number > maxNumber) {
//                maxNumber = number;
//            }
//            if (number < minNumber) {
//                minNumber = number;
//            }
//
//        }
//        System.out.println(maxNumber + " is max");
//        System.out.println(minNumber + " is min");



                     //Fibonacci Find 
        
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of Fibonacci terms: ");
//        int size = s.nextInt();
//
//        if (size <= 0) {
//            System.out.println("Please enter a positive number.");
//            return;
//        }
//
//        int[] fibArray = new int[size];
//
//        // First two terms
//        if (size >= 1) fibArray[0] = 0;
//        if (size >= 2) fibArray[1] = 1;
//
//        // Generate the rest of the series
//        for (int i = 2; i < size; i++) {
//            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
//        }



//
//        // Output the Fibonacci series

//        System.out.println("Fibonacci Series:");
//        System.out.println(Arrays.toString(fibArray));
//        
//        
//                      //Fibonacci Find
//        
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter how many Fibonacci numbers you want: ");
//        int n = input.nextInt();
//
//        int first = 0, second = 1;
//
//        System.out.println("Fibonacci Series up to " + n + " terms:");
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(first + " ");
//
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//        
//        System.out.println("Fibonacci Series up to " + input + " terms:");
//
//        for (int i = 1; i <= input; i++) {
//            System.out.print(number1 + " ");
//
//            int next = number1 + number2;
//            number1 = number2;
//            number2 = next;
//            
//          
//             System.out.println(s);
//        }




                    //Fibonacci Find

//        System.out.println(result);
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int size=s.nextInt();        
        
        int[] myArra=new int[size];
//        int n1=0;
//        int n2=1;
         myArra[0] = 0;
         myArra[1] = 1;
//         if (size >= 1) myArra[0] = 0;
//        if (size >= 2) myArra[1] = 1;
        
//        System.out.println(Arrays.toString(myArra));
        
        for (int i = 2; i <= myArra.length-1; i++) {
           
           myArra[i]=myArra[i-1]+myArra[i-2];
            
        }
        System.out.println(Arrays.toString(myArra));
        
        
        
        
        
        
//        Scanner s = new Scanner(System.in);

//        System.out.println("Enter Any number to Fnd Fibonacci");
//        int userInput = s.nextInt();
//
//        System.out.println("-------------------");
//
//        int number1 = 0;
//        int number2 = 1;
//        int sum = 0;
//
//        int totalSum = number2;//sob sum korte lagbe eta.
//
//        System.out.println(number1);
//        System.out.println(number2);
//
//        for (int i = 2; i < userInput; i++) {
//            sum = number1 + number2;
//            System.out.println(sum);
//  
//            number1 = number2;
//            number2 = sum;
//
//            totalSum += sum;//Sob fibo sum korte lagbe eta.
//        }
//
//        System.out.println("Fibonacci of " + userInput + " is " + sum);
//        System.out.println("----------------------");
//        System.out.println("Total of all number is " + totalSum);
//        System.out.println(totalSum);



        //Max-Min Number
        
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter limit");
//        int size=s.nextInt();
//        
//       int[] numbers=new int[size];        
//        
//        for (int index = 0; index <size; index++) {
//            System.out.println("Enter Number "+(index+1));
//            int userInput=s.nextInt();
//            numbers[index]=userInput;
//        }
//      
//        
//           int maxNumber=numbers[0];
//        int minNumber=numbers[0];
//        
//     for(int number:numbers){
//          if (number > maxNumber) {
//                maxNumber = number;
//            }
//            
//            if(number < minNumber){
//                minNumber = number;
//            }
//        }
//   
//     
//        System.out.println("Max Number "+ maxNumber + "    And    Min Number is "+ minNumber);\



        //Prime Number
        
//       Scanner s=new Scanner(System.in);
//        System.out.println("Enter Number");
//        int userInput=s.nextInt(); 
//        
//        
//        
//        int count = 0;
//        String prime="";
//        
//      if (userInput > 1) {
//
//            if (userInput > 0) {
//
//                for (int i = 1; i <= userInput; i++) {
//                    if (userInput % i == 0) {
//                        count++;
//                    }
//                }
//
//                if (count == 2) {
//                    prime=userInput+" is prime number";
//                    
//                } else {
//                    prime=userInput+" is not prime";
//                }
//            } else {
//                 prime=userInput+ " is negative number";
//            }
//
//        }
//      else {
//
//            if (userInput < 0) {
//                 prime=userInput+" is negative number";
//            } else {
//                 prime=userInput+ " is normal Number";
//            }
//
//        }
//      System.out.println(prime);




//Max Min find

//Scanner s=new Scanner(System.in);
//        System.out.println("Enter limit");
//        int size=s.nextInt();
//        
//       int[] numbers=new int[size];        
//        
//        for (int index = 0; index <size; index++) {
//            System.out.println("Enter Number "+(index+1));
//            int userInput=s.nextInt();
//            numbers[index]=userInput;
//        }
//        System.out.println("My number are "+Arrays.toString(numbers));
//        
//           int maxNumber=numbers[0];
//        int minNumber=numbers[0];
//        
//     for(int number:numbers){
//          if (number > maxNumber) {
//                maxNumber = number;
//            }
//            
//            if(number < minNumber){
//                minNumber = number;
//            }
//        }
//     String message = "Max Number is "
//                + maxNumber + "\n"
//                + "Min Number is "
//                + minNumber;
//     
//        System.out.println(message);
    }

}



