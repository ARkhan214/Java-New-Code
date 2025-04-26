package currenttime;

import java.util.Scanner;

public class CurrentTime {

    public static void main(String[] args) {
//       long time=System.currentTimeMillis();
//        System.out.println(time);
//        
//        long seconds=time/1000;
//        long currsec=seconds%60;
//        long hour=seconds/3600;
//        long minute=hour%60;
//        long currenthour=hour%24;
//        
//        System.out.println(currenthour+" Hours "+minute+" Minutes "+currsec+" Secound ");
        


 Scanner long input=new Scanner(System.in);
        System.out.println("Enter Any Second");
        
        long minute1=input/60;
        long extrasecond=minute%60;       
        long minute=hour%60;
        long day=hour/24;
         long hour=day%24;
         
        System.out.println(currenthour+" Hours "+minute+" Minutes "+currsec+" Secound ");
    }
    
}
