package Generic;
import java.util.List;
import java.util.Arrays;

public class Viewer {
    // İstənilən tipdə listi çap edən metod
    public static void printAnything(List<?> data) {
        System.out.println("\nList elementləri:");
        for (Object item : data) {
            System.out.println("- " + item.toString());
        }
    }
}


//4