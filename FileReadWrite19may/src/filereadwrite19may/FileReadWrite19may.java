package filereadwrite19may;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadWrite19may {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\HP\\OneDrive\\Desktop\\newfile.txt");

            pw.write("Hi java student.I am a new student of java");
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWrite19may.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Scanner s = new Scanner(new File("C:\\Users\\HP\\OneDrive\\Desktop\\newfile.txt"));
            System.out.println(s.nextLine());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWrite19may.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
