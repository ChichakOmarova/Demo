
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add(String.valueOf(12));
        names.add(String.valueOf(15));

        Set<String> ages = new LinkedHashSet<>();
        ages.add("fghjk");
        ages.add("cvbj");
        ages.add("rtyu");

        System.out.println(names.addAll(ages));

        names.forEach(System.out::println);
    }
}