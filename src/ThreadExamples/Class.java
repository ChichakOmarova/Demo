package ThreadExamples;
//3
public class Class extends Thread{
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Running");
            Thread.sleep(1000); // TIMED_WAITING state
            System.out.println(Thread.currentThread().getName() + ": Finished");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ": Interrupted");
        }
    }
}


