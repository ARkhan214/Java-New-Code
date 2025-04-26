
package findprimenumberbyudingmethod;

import java.util.Scanner;


public class FindPrimeNumberByUdingMethod {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int userInput=s.nextInt();
         String result=primeFind(userInput);
        System.out.println(result);
        
//        if () {
//          
//        }
//        else{System.out.println(userInput+" is not number.You Must input number");}       
              
    }
    
    public static String primeFind(int input){
        
        int count = 0;
        String prime="";
        
      if (input > 1) {

            if (input > 0) {

                for (int i = 1; i <= input; i++) {
                    if (input % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    prime=input+" is prime number";
                    
                } else {
                    prime=input+" is not prime";
                }
            } else {
                 prime=input+ " is negative number";
            }

        } else {

            if (input < 0) {
                 prime=input+" is negative number";
            } else {
                 prime=input+ " is normal Number";
            }

        }
      
       return prime;
        
        
        
        
//    Scanner n = new Scanner(System.in);
//
//        System.out.println("Enter number");
//        int input = n.nextInt();

//        int count = 0;
//        String prime="";
//        
//      if (input > 1) {
//
//            if (input > 0) {
//
//                for (int i = 1; i <= input; i++) {
//                    if (input % i == 0) {
//                        count++;
//                    }
//                }
//
//                if (count == 2) {
//                    System.out.println(input+" is prime number");
//                } else {
//                    System.out.println(input+" is not prime");
//                }
//            } else {
//                System.out.println(input + " is negative number");
//            }
//
//        } else {
//
//            if (input < 0) {
//                System.out.println(input+" is negative number");
//            } else {
//                System.out.println(input + " is normal Number");
//            }
//
//        }
//      
//       return prime;
    }    
    
}
