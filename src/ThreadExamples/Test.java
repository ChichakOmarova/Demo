package ThreadExamples;
//4
public class Test {

    public static void main(String[] args) {
        Runnable testIt = () -> System.out.println(Thread.currentThread().getName() + " printing");
        testIt.run();
    }

}
