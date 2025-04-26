package evidenceexampreparation;

import java.util.Arrays;
import java.util.Scanner;

public class EvidenceExamPreparationBubbleSort {

    public static void main(String[] args) {
       
        //Bubble Sort    
        Scanner k=new Scanner(System.in);
        
        System.out.println("Enter value size");
        int size=k.nextInt();
        
        int[] myArray=new int[size];
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter value "+(i+1));
            int value=k.nextInt();
            myArray[i]=value;
        }
//        System.out.println(Arrays.toString(myArray));
        
        for (int round = 0; round < myArray.length-1; round++) {
            for (int step = 0; step < myArray.length-round-1; step++) {
                if (myArray[step]>myArray[step+1]) {
                    
                    int sort=myArray[step+1];
                    
                    myArray[step+1]=myArray[step];
                    myArray[step]=sort;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         Scanner s = new Scanner(System.in);
//        
//        System.out.println("Enter sixe of number");
//        int size=s.nextInt();
//        
//        int[] myArray=new int[size];
//        
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Enter Value "+(i+1));
//           int userValue=s.nextInt();
//           myArray[i]=userValue;
//            
//        }
//        
//        
//        for (int round = 0; round < myArray.length-1; round++) {
//            for (int step = 0; step < myArray.length-round-1; step++) {
//                if (myArray[step]>myArray[step+1]) {
//                   int smallNumber=myArray[step+1];
//                    myArray[step+1]=myArray[step];
//                    myArray[step]=smallNumber;
//                }
//            }
//            
//        }
//        System.out.println(Arrays.toString(myArray));
        
        
        
        
    




 


        
        
        
        
           
        
        
        
        
        
        
        
        
        
        
      



    }

}
