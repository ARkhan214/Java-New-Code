
package filetask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




public class FileTask {

   
    public static void main(String[] args) {
//       File even=new File("C:\\Users\\Admin\\Desktop\\Even Number.txt");
//        
       
        
//        try {
//            PrintWriter pf=new PrintWriter(even);
//            for (int i = 1; i <= input; i++) {
//                if (i%2==0) {
//                    pf.print(i+", ");
//                }
//                
//            }
//            pf.close();
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileTask.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
    PrintWriter n;
        try {
             
            n = new PrintWriter("C:\\Users\\Admin\\Desktop\\Odd Number.txt");
            Scanner s=new Scanner(System.in);
        System.out.println("enter limit how much you want");
        int input=s.nextInt();
            
              for (int i = 1; i <= input; i++) {
                if (i%2!=0) {
                    n.println(i+", ");
                }
                
            }
            
              n.print(s);
            n.close();
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(FileTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        
        
        
        
        
        
        
        
//        File even=new File("C:\\Users\\Admin\\Desktop\\Even Number.txt");
//        
//        try {
//            PrintWriter pf=new PrintWriter(even);
//            for (int i = 1; i <= 50; i++) {
//                if (i%2==0) {
//                    pf.print(i+", ");
//                }
//                
//            }
//            pf.close();
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileTask.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
}
