
package methodpraticeinhome;

import java.util.Arrays;
import java.util.Scanner;




public class MethodPraticeInHome {

   
    public static void main(String[] args) {
      //Bubble Sort
    Scanner s=new Scanner(System.in);
        System.out.println("Enter Array size");
        int size=s.nextInt();
       int[] storeSize=new int[size];
       
        System.out.println(Arrays.toString(storeSize));
        
        
        for (int i = 0; i < storeSize.length; i++) {
            System.out.println("Enter Value");
           int value=s.nextInt();
           storeSize[i]=value;
           
        }
     String result=Arrays.toString(storeSize);

    
     
        System.out.println(result);

       
    }
     
}




//   Scanner s=new Scanner(System.in);
//        System.out.println("Enter size limit");
//        int size=s.nextInt();
//        
//       int[] myArray=new int[size];
//        for (int index= 0; index <myArray.length; index++) {
//            System.out.println("Enter Value "+(index+1));
//            int value=s.nextInt();
//           myArray[index]=value;
//        }
//        System.out.println(Arrays.toString(myArray));

























