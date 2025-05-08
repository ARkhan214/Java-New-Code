
package threaddemo;


public class ThreadDemo {

   
    public static void main(String[] args) {
       Runnable printA=new PrintChar("A", 20);
       Runnable printB=new PrintChar("B", 20);
       Runnable print100=new PrintNum(11);
        
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread100 = new Thread(print100);
        
        thread1.start();
        thread2.start();
        thread100.start();
        
    }
    
}
