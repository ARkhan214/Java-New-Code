
package threadandpoolmanagement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadAndPoolManagement {

    
    public static void main(String[] args) {
        ExecutorService execute=Executors.newFixedThreadPool(3);
        
        for (int i = 1; i <= 5; i++) {
            Runnable r=new MyTask(i);
            execute.submit(r);
            
        }
        execute.shutdown();
    }
    
}
