

import java.util.Scanner;

public class Findbugs2 {
    static String[] books = {"Java Basics", "Data Structures", "Algorithms"};
    static boolean[] isBorrowed = {false, false};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary System");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewBooks();
                case 2:
                    borrowBook(scanner);
                case 3:
                    returnBook(scanner);
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    static void viewBooks() {
        for (int i = 0; i <= books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + " - " + (isBorrowed[i] ? "Borrowed" : "Available"));
        }
    }

    static void borrowBook(Scanner scanner) {
        System.out.print("Enter book index to borrow (1-3): ");
        int index = scanner.nextInt();

        if (index < 0 || index > books.length) {
            System.out.println("Invalid book selection");
        } else if (isBorrowed[index]) {
            System.out.println("Book already borrowed");
        } else {
            isBorrowed[index] = true;
            System.out.println("You borrowed: " + books[index]);
        }
    }

    static void returnBook(Scanner scanner) {
        System.out.print("Enter book index to return (1-3): ");
        int index = scanner.nextInt();

        if (!isBorrowed[index]) {
            System.out.println("This book was never borrowed");
        } else {
            isBorrowed[index] = false;
            System.out.println("Book returned: " + books[index]);
        }
    }
}
