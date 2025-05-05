
package javaapplication61;

import java.net.Socket;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class JavaApplication61 {


    public static void main(String[] args) {
        
        LinkedList<Integer> a = new LinkedList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
       int userInput = s.nextInt();
        
        for (int i = 0; i <= userInput ; i++) {
            System.out.println("Enter the value");
            userInput=s.nextInt();
            a.add(userInput);
        }
        Collections.sort(a);
        System.out.println(a);
        
        
    }
    
}
