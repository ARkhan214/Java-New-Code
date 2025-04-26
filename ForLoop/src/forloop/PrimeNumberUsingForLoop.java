package forloop;

import java.util.Scanner;

public class PrimeNumberUsingForLoop {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("Enter number");
        int input = n.nextInt();

        int count = 0;

        if (input > 1) {

            if (input > 0) {

                for (int i = 1; i <= input; i++) {
                    if (input % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.println(input+" is prime number");
                } else {
                    System.out.println(input+" is not prime");
                }
            } else {
                System.out.println(input + " is negative number");
            }

        } else {

            if (input < 0) {
                System.out.println(input+" is negative number");
            } else {
                System.out.println(input + " is normal Number");
            }

        }

    }
}
