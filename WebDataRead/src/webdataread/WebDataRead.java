
package webdataread;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class WebDataRead {

   
    public static void main(String[] args) {
       try {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Web Address: ");
            String urlLink = scan.next();

            System.out.print("Enter Web Address: ");
            String fileName = scan.next();

            URL url = new URL("https://" + urlLink);

            String result = "";

            try {
                Scanner link = new Scanner(url.openStream());
                while (link.hasNext()) {
                    result += link.nextLine();
                }
                
                File file = new File("C:\\Users\\HP\\OneDrive\\Desktop\\" + fileName + ".html");
                try (PrintWriter pw = new PrintWriter(file)) {
                    pw.println(result);
                    System.out.println("Your file created successfully.");
                }
            } catch (IOException ex) {
                System.out.println(ex);
//                Logger.getLogger(WebData.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        } catch (MalformedURLException ex) {
            System.out.println(ex);
//            Logger.getLogger(WebData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
