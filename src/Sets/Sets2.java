import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
public class Sets2 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add(String.valueOf(12));
        names.add(String.valueOf(15));
        names.add("abc");
        Set<String> ages = new LinkedHashSet<>();
        ages.add("fghjk");
        ages.add("cvbj");
        ages.add("rtyu");

        names.addAll(ages);

        List<String> namesList = new ArrayList<>(names);
        int index = 2; 
        if (index >= 0 && index < namesList.size()) {
            String valueAtIndex = namesList.get(index);
            System.out.println("İndeks " + index + "-dəki dəyər: " + valueAtIndex);
        } else {
            System.out.println("Verilmiş indeks dəstin ölçüsündən kənardadır.");
        }

        names.forEach(System.out::println);
    }
}