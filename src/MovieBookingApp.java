
import java.util.Scanner;

public class MovieBookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] movies = {"Inception", "Interstellar", "The Matrix", "Avatar"};
        boolean bookingConfirmed = false;

        System.out.println("Welcome to the Movie Booking System!");

        while (!bookingConfirmed) {
            System.out.println("\nAvailable Movies:");
            for (int i = 0; i < movies.length; i++) {
                System.out.println(movies[i]);
            }
        }

        System.out.print("\nEnter the movie name you want to book: ");
        String selectedMovie = scanner.nextLine();

        boolean movieExists = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equals(selectedMovie)) {
                movieExists = true;
                break;
            }
        }

        if (!movieExists) {
            System.out.println("Invalid movie selection. Try again.");

        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String ticketPrice = (age < 12) ? "$5 (Child Price)" :
                (age < 18) ? "$8 (Teen Price)" :
                        "$10 (Adult Price";

        System.out.println("Ticket Price for " + selectedMovie + ": " + ticketPrice);

        System.out.print("Confirm booking? (yes/no): ");
        String confirmation = scanner.next();

        switch (confirmation.toLowerCase()) {
            case "yes":
                System.out.println("Booking confirmed! Enjoy your movie.");
                bookingConfirmed = true;
                break;
            case "no":
                System.out.println("Booking cancelled.");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }

    }


}




/*
Notes ->
when i confirm book, i want system to exit.
I want so see movies with their indexes
Find another exceptions by yourself (while -> running and testing code)
 */
