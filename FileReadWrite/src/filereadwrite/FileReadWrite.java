/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filereadwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class FileReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

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
                p.println("jsdkfghkfdgkjfhgkjfhgkjfh    fdskjfhdskjfhdkjhfkjdf");
                p.close();
            }
            
            Scanner read = new Scanner(f);
            System.out.println("The Text is: " + read.nextLine());

        } catch (FileNotFoundException ex) {
            System.out.println(ex);        }
    }
    
}
