package ThreadExamples;
//1
class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Running " + threadName);
        System.out.println(threadName + " finished.");
    }
}

