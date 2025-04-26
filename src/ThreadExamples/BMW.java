package ThreadExamples;

public class BMW {

    public static void main(String[] args) {
        Runnable carGenerator = () -> {
            for (int i = 1; i <= 7; i++) {
                    System.out.println("BMW version " + i);
            }
        };

        Thread thread = new Thread(carGenerator);
        thread.start();
    }

}

