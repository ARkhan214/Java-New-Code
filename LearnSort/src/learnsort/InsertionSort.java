package learnsort;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size = s.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter "+(i+1)+" Value");
            int input1 = s.nextInt();
            list[i] = input1;
        }

        for (int i = 1; i < list.length; i++) {
            int currentEliment = list[i];
            int f;
            for (f = i - 1; f >= 0 && list[f] > currentEliment; f--) {
                list[f + 1] = list[f];
            }
            list[f + 1] = currentEliment;

        }
        System.out.println("Sort Result is: "+Arrays.toString(list));

    }
    //Parvej github.com/gsparvej
    //Rakib github.com/rakib7512
}
