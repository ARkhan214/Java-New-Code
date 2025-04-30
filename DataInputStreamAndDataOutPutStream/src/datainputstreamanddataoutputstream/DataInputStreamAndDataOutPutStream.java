package datainputstreamanddataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataInputStreamAndDataOutPutStream {

    public static void main(String[] args) {
        try {
            FileWriter output=new FileWriter("Php.dat");
            
            DataOutput output = new DataOutputStream(new FileOutputStream("Php"));
            output.writeUTF("jamal");
            output.writeDouble(30.50);
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStreamAndDataOutPutStream.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            DataInputStream input = new DataInputStream(new FileInputStream("Php.dat"));
            System.out.println(input.readUTF());
            System.out.println(input.readDouble());
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStreamAndDataOutPutStream.class.getName()).log(Level.SEVERE, null, ex);
        }

        //        try {
//            PrintWriter datFile = new PrintWriter("C:\\Users\\Admin\\Desktop\\Java.dat");
//            datFile.print("Hy Bad Boy.");
//
//
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DataInputStreamAndDataOutPutStream.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
