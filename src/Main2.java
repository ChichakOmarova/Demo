//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Library library = new Library();
//
//        int choice;
//        while (true) {
//            System.out.println("1. View Books");
//            System.out.println("2. Borrow Book");
//            System.out.println("3. Return Book");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//
//            if (choice == 1) {
//                library.displayBooks();
//            } else if (choice == 2 || choice == 3) {
//                System.out.print("Enter book number: ");
//                int bookNumber = scanner.nextInt();
//                if (choice == 2) {
//                    library.borrowBook(bookNumber - 1); // Adjust for 0-based index
//                } else {
//                    library.returnBook(bookNumber - 1); // Adjust for 0-based index
//                }
//            } else if (choice == 4) {
//                System.out.println("Exiting...");
//                break;
//            } else {
//                System.out.println("Invalid choice. Please try again.");
//            }
//        }
//        scanner.close();
//    }
//}