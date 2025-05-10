
package hashcode;

import hashcode.students.Students;
import java.util.HashSet;


public class HashCode {

    
    public static void main(String[] args) {
        Students s=new Students("Atiq", 1, "JEE");
        Students a=new Students("Atiq", 1, "JEE");
        Students b=new Students("Atiq", 2, "JEE");
        Students c=new Students("Atiq", 3, "JEE");
        Students d=new Students("Atiq", 1, "JEE");
        Students ee=new Students("Atiq", 1, "JEE");
        Students f=new Students("Atiq", 1, "JEE");
        Students g=new Students("Atiq", 1, "JEE");

        HashSet<Students> set=new HashSet<>();
        set.add(s);
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(ee);
        set.add(f);
        set.add(g);
        
        System.out.println("Diffrent Data: "+set.size());
        System.out.println("---------------------");
        System.out.println("Hash Code is: "+set.hashCode());
       
       
        
    }
    
}
