package useconcatemaking;

import java.util.Scanner;

public class UseConcateMakingDate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Year");
        int year = input.nextInt();

        System.out.println("Enter Month");
        int month = input.nextInt();

        System.out.println("Enter Day");
        int day = input.nextInt();

        String fulldate = "Year "+year + "-" +"Month "+month + "-" +"Day "+ day;
        System.out.println("Date " + fulldate);

    }

}
