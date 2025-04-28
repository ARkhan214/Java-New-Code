
package methodsclass;

import java.util.Scanner;

public class MethodsClass {
//Note:-method er vetore method likha jai na .method call kora jai.tai amra main method er baire banaysi.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter first value");
        double num1=s.nextDouble();
        System.out.println("Enter second value");
        double num2=s.nextDouble();
        
        double finnalValueStore=doSum(num1,num2);
        
        
        System.out.println(finnalValueStore);
//        System.out.println((int)doSum(6, 6));
//        System.out.println(doSum(2342, 6));
//        
    }
    
    
    // note:-Method likhar niom.---  modifier returenValueType methodName(){
//    }; 
    
    //Note:-Static na likhle main method e call kora jabe na.
      public static double doSum(double number1,double number2){

       double result=number1+number2;
               return result;
       }   
    
      
//     public double doSum(double number1,double number2){
//
//       double result=number1+number2;
//               return result;
//       }     
      
      
      
      
      
//       public void doSum(double number1,double number2){
//
//       double result=number1+number2;
//               return result;
//       }
}
