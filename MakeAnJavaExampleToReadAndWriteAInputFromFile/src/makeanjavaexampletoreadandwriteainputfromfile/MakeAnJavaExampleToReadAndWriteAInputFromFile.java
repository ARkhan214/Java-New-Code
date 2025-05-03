package makeanjavaexampletoreadandwriteainputfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MakeAnJavaExampleToReadAndWriteAInputFromFile {

    public static void main(String[] args) {

//        File f = new File("C:\\Users\\Admin\\Desktop\\java.txt");
//        
//            try {
//                PrintWriter text = new PrintWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\java.txt"));
//               
//                
//            } catch (IOException ex) {
//                Logger.getLogger(MakeAnJavaExampleToReadAndWriteAInputFromFile.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        File f = new File("C:\\Users\\Admin\\Desktop\\java.txt");
//            Scanner fileName=new Scanner(System.in);
        try {
            try (PrintWriter p = new PrintWriter(f)) {
                p.write("I am Abdur Rahim");
                p.close();
            }
            
            Scanner read = new Scanner(f);
            System.out.println("The Text is: " + read.nextLine());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MakeAnJavaExampleToReadAndWriteAInputFromFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
