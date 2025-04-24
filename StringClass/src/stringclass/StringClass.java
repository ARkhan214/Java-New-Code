
package stringclass;

import java.util.Scanner;


public class StringClass {

    
    public static void main(String[] args) {
//       String message=" Hay Buddy ";
//        System.out.println(message.length());
//        System.out.println(message.charAt(3));
//        System.out.println(message.concat(" how are you"));
//        System.out.println(message.toUpperCase());
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim());
       
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter user name");
//        
//        String userName=input.next();
//        System.out.println(userName.concat(" Proggrama"));
        




//       Scanner input=new Scanner(System.in);
//       
//        System.out.println("enter year");
//        int year=input.nextInt();
//        
//       
//        
////         Scanner input=new Scanner(System.in);
//       System.out.println("enter month");
//        String month=input.next();
//        
////         Scanner input=new Scanner(System.in);
//        System.out.println("enter date");
//        String date=input.next();
//        
////       String result=;
//        
//        System.out.println(month+" "+year+" "+date);
////        System.out.println(year.concat(" Proggrama"));




        Scanner input=new Scanner(System.in);
       
        System.out.println("Enter year");
        int year=input.nextInt();
        
       
//        Scanner input=new Scanner(System.in);
       System.out.println("enter month");
       int month=input.nextInt();
        String result="";
        
          switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "Feb";
                break;
            case 3:
                result = "Mar";
                break;

            default:
            case 4:
                result = "Apr";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "Jul";
                break;
            case 8:
                result = "Agu";
                break;
            case 9:
                result = "Sep";
                break;
            case 10:
                result = "Octo";
                break;
//                System.out.println("Invalid month");
        }
//         
        
//         Scanner input=new Scanner(System.in);
        System.out.println("enter date");
        String date=input.next();
        
//       String result=;
        
        System.out.println(result+" "+year+" "+date);
//        System.out.println(year.concat(" Proggrama"));
    }
       
       
    
}
