package Generic;

import java.util.Arrays;
import java.util.List;

public class Printer {
    // 1. Generic array çap edən metod
    public static <T> void showArray(T[] items) {
        System.out.println("\nArray çap olunur:");
        for (T item : items) {
            System.out.println("Element: " + item);
        }
    }

    // 2. Generic list çap edən metod
    public static <T> void showList(List<T> items) {
        System.out.println("\nList çap olunur:");
        for (T item : items) {
            System.out.println("Element: " + item);
        }
    }
}

//3