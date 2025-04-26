package Generic;

import java.util.Arrays;
import java.util.List;

public class ViewerMain {
    public static void main(String[] args) {
        // 1. String listi
        List<String> stringList = Arrays.asList("Java", "Python", "C++");
        Viewer.printAnything(stringList);

        // 2. Integer listi
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Viewer.printAnything(intList);

        // 3. Boolean listi
        List<Boolean> boolList = Arrays.asList(true, false, true);
        Viewer.printAnything(boolList);


    }
}//4