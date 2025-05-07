package multidimantionarray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimantionArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Row size");
        int rowySize = s.nextInt();
        
        System.out.println("Enter Column size");
        int colySize = s.nextInt();

        int[] a[] = new int[rowySize][colySize];

        while (true) {
            try {
                System.out.println("Enter Row Index Number(Index always Start from 0)");
                int rowNumber = s.nextInt();

                System.out.println("Enter Col Index Number(Index always Start from 0)");
                int colNumber = s.nextInt();

                System.out.println("Enter Value");
                int value = s.nextInt();
                
                a[rowNumber][colNumber] = value;

                System.out.println(Arrays.deepToString(a));

            } catch (Exception e) {
                System.out.println(e);
//              break;
                continue;
            }

        }

    }

}
