
package multidaimantionarrays;

import java.util.Arrays;
import java.util.Scanner;


public class MultiDaimantionArrays {
    
//    10 50 30
//    11 40 60
//    12 33 22
//    Make this 2-D array by user input.

    
    public static void main(String[] args) {
        
        Scanner n=new Scanner(System.in);
        
        System.out.println("Enter row");
        int row=n.nextInt();
        System.out.println("Enter col");
        int col=n.nextInt();
         
         
        int myArrays[][]=new int[row][col];
        
         for(int rows=0; rows<myArrays.length; rows++){
             
            for(int cols=0;cols<myArrays[row].length;cols++){
                System.out.println("enter limit value");
                int userInput=n.nextInt();
                myArrays[row][col]=userInput;
                } 
        } 
        
         
        for(int rows=0; rows<myArrays.length; rows++){
             
            for(int cols=0;cols<myArrays[row].length;cols++){
                System.out.println(myArrays[rows][cols]);
               
                }   
//       
//              
//            
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
