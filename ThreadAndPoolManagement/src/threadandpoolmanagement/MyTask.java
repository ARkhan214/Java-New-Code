package threadandpoolmanagement;

public class MyTask implements Runnable {

    public int iD;

    public MyTask() {
    }

    public MyTask(int iD) {
        this.iD = iD;
    }

    @Override
    public void run() {
        System.out.println("Work " + iD + " is running on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);

        } catch (Exception e) {
            System.out.println("Work " + iD + " was stop");
        }
        System.out.println("----------------------------");
        System.out.println("Work " + iD + " completed by " + Thread.currentThread().getName());
    }

}
