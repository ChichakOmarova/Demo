package ThreadExamples;
//2
public class ThreadStateExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread myRunnable = new MyThread();
        Thread myThread = new Thread(myRunnable, "MyThread");

        System.out.println(myThread.getName() + " state: " + myThread.getState()); // NEW

        myThread.start();

        Thread.sleep(500);
        System.out.println(myThread.getName() + " state: " + myThread.getState()); // TIMED_WAITING

        myThread.join();
        System.out.println(myThread.getName() + " state: " + myThread.getState()); // TERMINATED
    }
}

