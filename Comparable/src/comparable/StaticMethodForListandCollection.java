/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HP
 */
public class StaticMethodForListandCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String> list1=Arrays.asList("Fari","Fariha","Aria","Annacollins","Babbla");
        
//        Collections.shuffle(list1,new Random(5));

        Collections.sort(list1);
        System.out.println(list1);
        
    }
    
}
