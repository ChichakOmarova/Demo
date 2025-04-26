package Maps;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static  void countWords(String cumle) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        String[] words = cumle.split(" ");
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}