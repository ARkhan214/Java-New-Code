
package threaddemo;

public class PrintChar implements Runnable{
    
    
   private String charToPrint;
   private int time;

    public PrintChar(String charToPrint, int time) {
        this.charToPrint = charToPrint;
        this.time = time;
    }
                
   
    @Override
    public void run() {
        for (int i = 0; i < time; i++) {
            System.out.println(charToPrint);
        }

    }
   
   
   
    
    
    
    
}
