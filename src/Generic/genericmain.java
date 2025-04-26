package Generic;
import java.util.List;
import java.util.Arrays;

public class genericmain {
    public static void main(String[] args) {
        // Integer siyahısı
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Integer siyahısı:");
        StatsPrinter.displayStats(intList);

        // Double siyahısı
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("\nDouble siyahısı:");
        StatsPrinter.displayStats(doubleList);

        // String siyahısı (qadağandır, nümunə kimi şərhdə)
        // List<String> stringList = Arrays.asList("a", "b", "c");
        // StatsPrinter.displayStats(stringList); // XƏTA verəcək
    }
}//2