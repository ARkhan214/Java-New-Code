package readdatafromwebbyusingscanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadDataFromWebByUsingScanner {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com//index.html");

            try (BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                String result = "";
                PrintWriter pw = new PrintWriter("C:\\Users\\HP\\OneDrive\\Desktop\\google.html");
                while ((line = read.readLine()) != null) {
                    result += line;
                }
                pw.print(result);
                pw.close();

            } catch (IOException ex) {
                Logger.getLogger(ReadDataFromWebByUsingScanner.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadDataFromWebByUsingScanner.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            URL url=new URL("https://www.google.com//index.html");
//            
//            
//           try { 
//             Scanner scanneer=new Scanner(url.openStream());
//                System.out.println(scanneer.nextLine());        
//        
//               
//           }catch (IOException ex) {
//                Logger.getLogger(ReadDataFromWebByUsingScanner.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(ReadDataFromWebByUsingScanner.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
