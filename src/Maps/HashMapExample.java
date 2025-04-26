package Maps;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> abc = new HashMap<>();

        // add
        abc.put("Ali", 30);
        abc.put("Vali", 25);

        // update
        abc.put("Ali", 97);
        System.out.println( abc.get("Ali"));

        // delete
        abc.remove("Vali");
        System.out.println(abc);

        // entrySet
        System.out.println("Siyahı");
        for (Map.Entry<String, Integer> entry :abc.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // get
        System.out.println("Ali's age: " + abc.get("Ali"));

        // computeIfAbsent
        abc.computeIfAbsent("Ada", key -> 22);
        System.out.println(abc);

        //compute
        abc.compute("Ali", (key, val) -> val + 1); // Increments Alice's age
        System.out.println(abc);

        /*
        computeIfAbsent - siifrdan yaradir
        computeIfPresent - var olan databni update etmek uchun
        compute - eger icheride data varsa, xeta atir(try catch ile tutmaq lazimdir)
         */

    }
}