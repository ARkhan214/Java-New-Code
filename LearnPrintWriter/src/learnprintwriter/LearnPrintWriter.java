package learnprintwriter;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnPrintWriter {

    public static void main(String[] args) {

        //        try {
//            URI url=new URI("www.google.com/index.html");
//            Scanner scanner=new Scanner(url.openStream());
//            
//             } catch (URISyntaxException ex) {
//            Logger.getLogger(LearnPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
//        }
        File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\java.txt");  //file er location anlam

        try {
//             Scanner s=new Scanner(f);     
            PrintWriter pw = new PrintWriter(f);    //file a likhar jonno printWriter likhlam.
            pw.write("Hi Bangladeshi People." + "\n");
            pw.write("Hi Bangladeshi Men and Women." + "\n");
            pw.print("Do You Have Any Job?");

            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        }

//s.hasenext() dia sob line porlam abong sob line k split kore Arry te vorlam.
//        File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\java.txt");
//
//        try {
//             Scanner s=new Scanner(f);
//     
//            
//            while (s.hasNext()) {                
//                      
//            String text=s.nextLine();
//            
//            String[] mayArray=text.split(" ");
//            System.out.println(Arrays.toString(mayArray));
//            }
//             
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(LearnPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Score.txt");
//        try {
////            PrintWriter file=new PrintWriter(f);
//            Scanner s=new Scanner(f);
////            String text=s.nextLine();
////            String[] myArray=text.split(" ");
////            
////            System.out.println(Arrays.toString(myArray));
//
//
//            while (s.hasNext()) {
//
//                String text=s.nextLine();
//            String[] myArray=text.split(" ");
//
//            System.out.println(Arrays.toString(myArray));
//
//                
////                System.out.println(s.next());
//            }
////
//            
//            s.close();
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(LearnPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        File file=new File("Scores.txt");
//        if (file.exists()) {
//            System.out.println("File Alrady Exists");
//            System.exit(1);
//        }
//        try {
//            PrintWriter output=new PrintWriter(file);
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(LearnPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
