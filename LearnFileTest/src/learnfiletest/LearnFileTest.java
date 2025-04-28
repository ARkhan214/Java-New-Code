package learnfiletest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileTest {

    public static void main(String[] args) {

//        File f = new File("C:\\Users\\Admin\\Desktop\\java.txt");
//
//        System.out.println(f.canRead());
//        System.out.println(f.length());
//        System.out.println(f.canWrite());

//        PrintWriter pw;
//        try {
//
//             PrintWriter pw = new PrintWriter(f);
//            pw.write("Hi Bangladesh");
//            pw.print("Learn Java Earn Money");
//
//            pw.close();
//        }         
//        catch (FileNotFoundException ex) {
//            Logger.getLogger(LearnFileTest.class.getName()).log(Level.SEVERE, null, ex);
//        }

      

        File f = new File("C:\\Users\\Admin\\Desktop\\Hava.txt");

        PrintWriter pw;
        try {
            pw = new PrintWriter(f);

            for (int j = 1; j <= 50; j++) {

                if (j % 2 == 0) {
                    pw.println(j);
                    System.out.println(j);
                }

            }
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
