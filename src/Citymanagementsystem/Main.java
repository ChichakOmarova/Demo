package Citymanagementsystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Engineer("Alice", 30),
                new Student("Bob", 20),
                new Doctor("Clara", 35)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a city routine:");
        System.out.println("1. Work");
        System.out.println("2. Rest");
        System.out.println("3. Status Check");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performRoutine(people, "work");
                break;
            case 2:
                performRoutine(people, "rest");
                break;
            case 3:
                performRoutine(people, "status");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("\nDaily Routines:");
        for (Person person : people) {
            person.introduce();
            person.doWork();
        }

        people = null;
        System.gc();
        System.out.println("\nFinalizing...");
    }

    public static void performRoutine(Person[] people, String type) {
//        for (Person person : people) {
            if (type.equals("work")) {
//                person.doWork();
                for (Person person1: people) {
                    person1.doWork();
                }
            } else if (type.equals("rest")) {
//                person.rest();
                for (Person person1: people) {
                    person1.rest();
                }
            } else if (type.equals("status")) {
                for (Person person1: people) {
                try {
                    if (Math.random() > 0.5) {
                        throw new RuntimeException("City sensor malfunction for " + person1.name + "!");
                    }
                    System.out.println("All systems are nominal for " + person1.name + ".");
                } catch (RuntimeException e) {
                    System.out.println("⚠️ Error occurred: " + e.getMessage());

                }
            }
        }
    }
}
