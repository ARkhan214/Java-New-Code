
package usernameandpassword;

import java.util.Scanner;


public class UserNameAndPassword {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name");
        String input=s.next();
        
        String[] names={"Atiq","Arif","Rakib","Easin"};
        int[] password={12,21,23,22};
         
        for(int i = 0; i < names.length; i++) {
             int userPassword=0;
            if (input.equalsIgnoreCase(names[i])) {
                System.out.println("Enter Password");
                userPassword=s.nextInt(); 
            
            }
            
            if (userPassword == password[i]) {
              
                System.out.println("Congratulation "+input);
                
            }
//          
//      
        } 
        System.out.println("User Name is incorrect");
        
        
//         if (userPassword == password[i]){
////                System.out.println("Congratulation "+input);
////            }
    }
    
}
