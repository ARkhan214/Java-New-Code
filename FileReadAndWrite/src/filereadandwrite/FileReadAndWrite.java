package filereadandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadAndWrite {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\HP\\OneDrive\\Desktop\\java.txt");
//        try {
//            Scanner read=new Scanner(file);
//            try {
//                FileWriter f=new FileWriter(file);
//                PrintWriter pw=new PrintWriter(f);
//                
//                System.out.println("Enter your text");
//                String text=read.nextLine();
//                pw.print(text);
//                pw.close();
//                read.close();
//                
//                
//                Scanner re=new Scanner(file);
//                while (re.hasNext()) {                    
//                    System.out.println(re.nextLine());
//                }
                
        try {
            try {
                FileWriter f = new FileWriter(file);
                PrintWriter pw = new PrintWriter(f);
                pw.println("Ladis and jentelman .Jak du lolo.dfgdhghgcnc");
                pw.close();

            } catch (IOException ex) {
                Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
            }

            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
//            } catch (IOException ex) {
//                Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
        
        

    }

}
