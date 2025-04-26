package Generic;

import java.util.List;
import java.util.Arrays;

public class StatsPrinter {
    public static void displayStats(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
}

//2