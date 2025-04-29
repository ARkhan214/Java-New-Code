
package testfilestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFileStream {

    public static void main(String[] args) throws FileNotFoundException {
      
        try (FileOutputStream fos = new FileOutputStream("java.dat")) {
            try {
                fos.write(10);
                fos.write(50);
                fos.write(40);
                fos.close();                
                                
            } catch (IOException ex) {
                Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        FileOutputStream f=new FileOutputStream("java.dat");
        
        int value;
        
        while ((value=f.read())!= -1) {            
            
        }
       
        
        
        
    }
    
}
