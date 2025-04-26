
package arraypracticeinhome;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayPracticing {

 
   
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
     int input=s.nextInt();
        
        
//        String[] myArray=new String[input];
//        System.out.println(Arrays.toString(myArray));
        
        
        int[] myArray=new int[input];
        input=s.nextInt();
        System.out.println(Arrays.toString(myArray));
        
        int[] myArray1=new int[input];
        input=s.nextInt();
        System.out.println(Arrays.toString(myArray1));
        
       
        int[] myArray2=new int[input]; 
        
        System.out.println(Arrays.toString(myArray2));
    }
    
}
