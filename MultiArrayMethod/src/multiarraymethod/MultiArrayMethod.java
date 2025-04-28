package multiarraymethod;

import java.util.Scanner;

public class MultiArrayMethod {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
   
        System.out.println("Enter row");
        int row = n.nextInt();
        System.out.println("Enter col");
        int col = n.nextInt();
        int myArrays[][] = new int[row][col];

        for (int rows = 0; rows < myArrays.length; rows++) {

            for (int cols = 0; cols < myArrays[rows].length; cols++) {
                System.out.println("enter limit value");
                int userInput = n.nextInt();
                myArrays[rows][cols] = userInput;
            }
        }
        
        
        doSum(myArrays);

    }

    public static void doSum(int myArrays[][]) {

        int sum = 0;

        for (int rows = 0; rows < myArrays.length; rows++) {

            for (int cols = 0; cols < myArrays[rows].length; cols++) {

                sum += myArrays[rows][cols];

            }
        }
        System.out.println(sum);
    }

}
