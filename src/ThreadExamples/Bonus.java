package ThreadExamples;
public class Bonus{

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: Started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread 1: Interrupted while sleeping");
                return;
            }
            System.out.println("Thread 1: Finished");
        });
        thread1.start();
        System.out.println("Thread 1 state before start: " + thread1.getState());
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: Started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread 2: Interrupted while sleeping");
                return;
            }
            System.out.println("Thread 2: Finished");
        });
        System.out.println("Thread 2 state before start: " + thread2.getState());
        thread2.start();
        Thread.sleep(500);

        System.out.println("Thread 1 state after start and delay: " + thread1.getState());
        System.out.println("Thread 2 state after start and delay: " + thread2.getState());

        System.out.println("Joining thread 1");
        thread1.join();
        System.out.println("Thread 1 state after join: " + thread1.getState());

        System.out.println("Joining thread 2");
        thread2.join();
        System.out.println("Thread 2 state after join: " + thread2.getState());

        System.out.println("Main thread finished");
    }
}

