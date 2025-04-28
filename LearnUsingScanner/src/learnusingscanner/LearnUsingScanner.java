
package learnusingscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LearnUsingScanner {

  
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Admin\\Desktop\\javaplus.txt");
//          Scanner n=new Scanner(new File(pathname));
        try {
            Scanner n=new Scanner(f);   
            System.out.println(n.nextLine());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnUsingScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
