package Maps;
public class Main4 {
    public static void main(String[] args) {
        System.out.println("\nTapşırıq 4: Tələbə Bal Cədvəli");
        StudentScoreboard scoreboard = new StudentScoreboard();
        scoreboard.addStudent("Əli", 95);
        scoreboard.addStudent("Vəli", 88);
        scoreboard.addStudent("Sara", 92);
        scoreboard.addStudent("Kamal", 79);
        scoreboard.addStudent("Nərmin", 100);

        scoreboard.displayScoreboard();
    }
}
