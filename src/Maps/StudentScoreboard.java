package Maps;
import java.util.Map;
import java.util.TreeMap;

public class StudentScoreboard {
    private TreeMap<String, Integer> scores;

    public StudentScoreboard() {
        this.scores = new TreeMap<>();
    }

    public void addStudent(String name, int score) {
        this.scores.put(name, score);
        System.out.println(name + " əlavə olundu. Bal: " + score);
    }

    public void displayScoreboard() {
        System.out.println("Tələbə Bal Cədvəli:");
        for (Map.Entry<String, Integer> entry : this.scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
