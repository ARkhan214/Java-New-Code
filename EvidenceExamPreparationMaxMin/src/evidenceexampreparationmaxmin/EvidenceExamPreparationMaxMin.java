
package evidenceexampreparationmaxmin;

import java.util.Arrays;
import java.util.Scanner;


public class EvidenceExamPreparationMaxMin {

  
    public static void main(String[] args) {
        //Max min Find
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter size");
        int size=s.nextInt();
        
        int[] myArray=new int[size];
        //0,1,2,3,4
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter value "+(i+1));
            int value=s.nextInt();
            myArray[i]=value;
        }
        
        int maxNumber=myArray[0];
        int minNumber=myArray[0];
        
     for(int item:myArray){
         //80,70,90,50,
         if (item>maxNumber) {
             maxNumber=item;
             
             
         }     //80,70,90,50,
         if (item<minNumber) {
             minNumber=item;
           
         }
     }
        System.out.println("max number is "+maxNumber+"     "+" min number is "+minNumber);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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


//for each loop......

//     for(int number:numbers){
//          if (number > maxNumber) {
//                maxNumber = number;
//            }
//            
//            if(number < minNumber){
//                minNumber = number;
//            }
//        }  System.out.println("Max Number "+ maxNumber + "    And    Min Number is "+ minNumber);
    }
    
}
