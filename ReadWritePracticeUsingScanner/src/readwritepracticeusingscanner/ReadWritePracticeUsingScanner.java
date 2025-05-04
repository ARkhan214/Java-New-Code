
package readwritepracticeusingscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadWritePracticeUsingScanner {

    
    public static void main(String[] args) {
        try {
            PrintWriter fileName=new PrintWriter("C:\\Users\\HP\\OneDrive\\Desktop\\Score.txt");
            fileName.print("Bangladesh is a South asian country");
            fileName.close();
            
            try {
                Scanner a=new Scanner((Path) fileName);
                
                System.out.println(a);
            } catch (IOException ex) {
                Logger.getLogger(ReadWritePracticeUsingScanner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
            
        catch (FileNotFoundException ex) {
            Logger.getLogger(ReadWritePracticeUsingScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
