package Generic;

import java.util.List;
public class NewMain {
    public static void main(String[] args) {
        // 1. String array testi
        String[] stringArray = {"Aytac", "Nermin", "Kamran"};
        Printer.showArray(stringArray);

        // 2. Integer array testi
        Integer[] intArray = {10, 20, 30, 40};
        Printer.showArray(intArray);

        // 3. String list testi
        List<String> stringList = List.of("Alma", "Armud", "Nar");
        Printer.showList(stringList);

        // 4. Double list testi
        List<Double> doubleList = List.of(1.5, 2.7, 3.9);
        Printer.showList(doubleList);
    }
}//3