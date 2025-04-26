package Maps;
import java.util.Scanner;
import java.util.TreeSet;

public class SortedNameList {
    private TreeSet<String> names;
    private Scanner scanner;

    public SortedNameList() {
        this.names = new TreeSet<>();
        this.scanner = new Scanner(System.in);
    }

    public void getNamesFromUser() {
        System.out.println("Zəhmət olmasa, 5 ad daxil edin:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ad " + (i + 1) + ": ");
            String name = scanner.nextLine();
            this.names.add(name);
        }

        System.out.println("Sıralanmış adlar:");
        int i = 1;
        for (String name : this.names) {
            System.out.println(i + ". " + name);
            i++;
        }
        scanner.close();
    }
}
