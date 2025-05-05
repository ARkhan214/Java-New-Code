
package multidaimantionarrays;

import java.util.Arrays;
import java.util.Scanner;


public class MultiDaimantionArrays {
    
//    10 50 30
//    11 40 60
//    12 33 22
//    Make this 2-D array by user input.

    
    public static void main(String[] args) {
        
        
        int[][] number={{1,99,91,11,44},{0,10,9,9,11}};
        
        
        
        
        
        
        
        
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Row Number ");
        int rowNumber = s.nextInt();

        System.out.println("Enter Column Number ");
        int columnNumber = s.nextInt();
        
        int[][] myArrays = new int[rowNumber][columnNumber];

        for (int row = 0; row < myArrays.length; row++) {

            for (int col = 0; col < myArrays[row].length; col++) {
                System.out.println("Enter item value ");
                int userInput = s.nextInt();
                myArrays[row][col] = userInput;

            }
        }
        
        System.out.println("--------------------------------");
        
         for(int row=0; row < myArrays.length; row++){
        
            for(int col=0; col< myArrays[row].length; col++){
                
                System.out.print(myArrays[row][col]+ "\t");            
            }  
            
            System.out.println("\n");
            
        }
         
         
         
         
         
         
         
        
         
//        for (int i = 0; i < myArrays.length; i++) {
//            
//            int[] myArray = myArrays[i];            
//        }
//         
        
        
        
       
        
//        myArrays[0][1]=5;
//        myArrays[1][1]=8;
//        myArrays[1][0]=8;
//        System.out.println(Arrays.deepToString(myArrays));
        
//        for (int[] myArray : myArrays) {
//            for (int col = 0; col < myArray.length; col++) {
//                System.out.println(myArray[col] + " ");
//            }
//            System.out.println("\n"); 
//        }
//       for(int row=0;row<myArrays.length;row++){
//            for(int col=0;col<myArrays[row].length;col++){
//                System.out.println(myArrays[row][col]+" ");
//              
//            }
//              System.out.println("\n"); 
//        }
    }
    
}
