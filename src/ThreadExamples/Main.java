package ThreadExamples;
//3
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Class myThread = new Class();
        myThread.setName("MyThread");

        System.out.println(myThread.getName() + " state: " + myThread.getState()); // NEW

        myThread.start();

        Thread.sleep(500);
        System.out.println(myThread.getName() + " state: " + myThread.getState()); // TIMED_WAITING

        myThread.join();
        System.out.println(myThread.getName() + " state: " + myThread.getState()); // TERMINATED
    }
}