package usingswitchmakingcalculator;

import java.util.Scanner;

public class UsingSwitchMakingCalculator {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter first number");
//        double number1 = input.nextDouble();
//
//        System.out.println("Enter second number");
//        double number2 = input.nextDouble();
//
//        System.out.println("Enter your Choice as + - * /");
//        String choice = input.next();
//
//        double result = 0;
//
//        switch (choice) {
//            case "+":
//                result = number1 + number2;
//                break;
//            case "-":
//                result = number1 - number2;
//                break;
//            case "*":
//                result = number1 * number2;
//                break;
//            case "/":
//                result = number1 / number2;
//                break;
//
//            default:
//                System.out.println("Invalid calculation");
//        }
//System.out.println("Result is "+result);

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter letter");
//        char letter = input.next().toUpperCase().charAt(0);
//        
//        if (Character. isLetter(letter)) {
//            switch (letter) {
//                case 'A':
//                    System.out.println(letter + " is vowel");
//                    break;
//                case 'E':
//                    System.out.println(letter + " is vowel");
//                    break;
//                case 'I':
//                    System.out.println(letter + " is vowel");
//                    break;
//                case 'O':
//                    System.out.println(letter + " is vowel");
//                    break;
//                case 'U':
//                    System.out.println(letter + " is vowel");
//                    break;
//
//                default:
//                    System.out.println(letter + " is consonant");
//            }
//
//        } else {
//            System.out.println("Invalid");
//        }
//        
//      game   
//        Scanner input = new Scanner(System.in);
//        System.out.println("Guess any number 0 to 9");
//        int number=input.nextInt();
//       
//          int random=(int)(Math.random()*10);
//        System.out.println(random);
//        
//        if (number==random) {
//            System.out.println("Congratulations!!\nYou win");
//        }
//        else{System.out.println("You lose your guess");}

//        other way

        int random = (int) (Math.random() * 10);
        System.out.println(random);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess any number 0 to 9");
        int number = input.nextInt();

//      int random=(int)(Math.random()*10);
        System.out.println(random);

        if (number == random) {
            System.out.println("Congratulations!!\nYou win");
        } 
        else {
            System.out.println("You lose your guess");
        }

    }

}
