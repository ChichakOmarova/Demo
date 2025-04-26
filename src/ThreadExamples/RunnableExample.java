package ThreadExamples;
//1,5
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("Thread 1");
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();


        System.out.println("Main thread continues...");

    }
}

