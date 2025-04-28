package arrayclasslwithmethod;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClasslWithMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many times you want put value.");
        int n = s.nextInt();
        String[] myArray = new String[n];
//
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number");
            String userInput = s.next();
            myArray[i] = userInput;
//            if (myArray[i].equalsIgnoreCase("=")) {
//                myArray[i] = null;
//                break;
//            }
            if (myArray[i].equalsIgnoreCase("=")) {
                myArray[i] = null;
                break;
            }

//   if (myArray[i].equals("=")) {
//                myArray[i] = null;
//                break;
//            }
//        }
//        doSum(myArray);
//System.out.println(myArray);
            System.out.println(Arrays.toString(myArray));

        }

    }

    public static int doSum(int... b) {
        int sum = 0;

        for (int item : b) {
            sum += item;
        }
//        System.out.println(sum);

        return sum;}
    
}
