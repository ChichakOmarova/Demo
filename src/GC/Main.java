package GC;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.displayInfo();
        service = null;
        System.gc(); //= finalize()
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
