package loopclass;

//import com.sun.source.tree.IfTree;
import java.util.Scanner;

public class GuessNumberThreeTimesByUsingLoop {

    public static void main(String[] args) {

        //range 0 to 9       
       
        
        Scanner inpu = new Scanner(System.in);
       
         int randomNumber = (int) (Math.random() * 10);
        System.out.println(randomNumber);
        
        System.out.println("Enter Guess number 0 to 9");
        
        
        int count = 0;
        boolean isGuessed = false;

        while (count<3) {            
            System.out.println("Enter your guess number");
            int input = inpu.nextInt(); 
            
            if (randomNumber == input) {
                System.out.println("Your Win");
                isGuessed = true;
                break;
            } else if (randomNumber < input) {
                System.out.println("Your guess number is High");
            } else{
                System.out.println("Your guess number is Lower");
            }
          
            count++;

        }
        
          if (!isGuessed) {
                System.out.println("Sorry!! Try next time");
            }
        inpu.close();



//Scanner inp = new Scanner(System.in);
//        int randomNumber = (int) (Math.random() * 10); // generates number from 0 to 9
////        
//        System.out.println(randomNumber);
////
//        System.out.println("Guess a number between 0 and 9. You have 3 attempts.");
////
//        int count = 0;
//        boolean isGuessed = false;
//
//        while (count < 3) {
//            System.out.print("Enter your guess: ");
//            int userInput = s.nextInt();
//
//            if (userInput == randomNumber) {
//                System.out.println("You Win!");
//                 isGuessed = true;
//                break;
//            } else if (userInput < randomNumber) {
//                System.out.println("Too low!");
//               
//            } else {
//                System.out.println("Too high!");
//            }
//
//            count++;
//        }
//
//        if (!isGuessed) {
//            System.out.println("Better Luck Next Time! The correct number was: " + randomNumber);
//        }
        // s.close();






        
        
//        Scanner s = new Scanner(System.in);
//        int randomNumber = (int) (Math.random() * 10); // generates number from 0 to 9
//        
//        System.out.println("Guess "+ randomNumber);
//
//        System.out.println("Guess a number between 0 and 9. You have 3 attempts.");
//
//        int attempts = 0;
//        boolean isGuessed = false;
//
//        while (attempts < 3) {
//            System.out.print("Enter your guess: ");
//            int userInput = s.nextInt();
//
//            if (userInput == randomNumber) {
//                System.out.println("You Win!");
//                 isGuessed = true;
//                break;
//            } else if (userInput < randomNumber) {
//                System.out.println("Too low!");
//               
//            } else {
//                System.out.println("Too high!");
//            }
//
//            attempts++;
//        }
//
//        if (!isGuessed) {
//            System.out.println("Better Luck Next Time! The correct number was: " + randomNumber);
//        }
        // s.close();
        
        
        
        //range 0 to 100 
//        int randomNumber=(int)(Math.random()*101);  //erokom thakle random number agae print hobe.
//         System.out.println(randomNumber);
//        Scanner inp=new Scanner(System.in);
//        
//        System.out.println("Enter number");
//        int input=inp.nextInt();
//        
//       int randomNumber=(int)(Math.random()*101);
//        
//        int count=1;
//        
//        while (count<3) {
////            System.out.println("Enter your guess number");
//
//            if (randomNumber==input) {
//                System.out.println("Your Win");                
//                break;
//            }
//            else if (randomNumber<input) {
//                 System.out.println("Your guess number is High");
//                System.out.println("Enter your guess number");
//                input=inp.nextInt();
//            }
//            else if (randomNumber>input) {
//                 System.out.println("Your guess number is Lower");
//                System.out.println("Enter your guess number");
//                input=inp.nextInt();
//            }
//            if (count==2) {
//                System.out.println("Sorry!! Try next time");
//            }
//            count++;
//
//        }
//        
//        
//        int i = 1; int sum = 0; 
//        do { sum += i; i++; } 
//        while (i <= 5); 
//        System.out.println("Sum of numbers from 1 to 5 is: " + sum);
//        Scanner s = new Scanner(System.in);
//        int input =s.nextInt();
//        int count = 1;
//        long factorial =1;
//        
//          System.out.println("Enter value");     
////          input = s.nextInt();       
//                
//        if (input < 0) {
//            System.out.println("Enter posative number");
//        } 
//        else {
//            do {
//                factorial *= count;
//                count++;
//            }
//            while (count<=input);
//        }
//        System.out.println(factorial);
    }
}
