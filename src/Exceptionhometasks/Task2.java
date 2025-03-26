package Exceptionhometasks;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = 1000.00;

        System.out.printf("Current balance: "+ currentBalance);
        System.out.print("Enter amount to deposit: ");

        try {
            double depositAmount = scanner.nextDouble();

            if (depositAmount <= 0 ) {
                System.out.println("Deposit amount must be positive.");

            }  else if (currentBalance < depositAmount) {
                System.out.println("Insufficient funds. You cannot deposit more than your current balance.");
            }else {
                currentBalance -= depositAmount;
                System.out.printf("Deposit successful! New balance: "+ currentBalance);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Oops! Please enter a valid amount.");
        } finally {
            scanner.close();
        }

    }
}




