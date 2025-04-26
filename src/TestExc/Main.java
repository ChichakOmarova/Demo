package TestExc;

public class Main {
    public static void main(String[] args) throws Exception{

        called();

        System.gc();
        System.out.println("MySuper object is removed by Garbage Coll");
        Thread.sleep(1000);

        System.out.println("My app finished");

    }

    public static void called() {
        MySuper mySuper = new MySuper();
        mySuper.printMe();
    }
}
