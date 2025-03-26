import java.util.Scanner;

public class Newbugs2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carModels = {"Sedan", "SUV", "Convertible", "Truck"};
        double[] basePrices = {50.0, 70.0, 100.0, 80.0};
        String[] carTypes = {"Economy", "Luxury", "Sports", "Utility"};
        int[] carAges = {3, 5, 2, 7};
        boolean[] isAvailable = {true, false, true, true};

        System.out.println("Choose a car model:");
        for (int i = 0; i < carModels.length; i++) {
            System.out.println((i + 1) + ". " + carModels[i] + " (" + carTypes[i] + ")");
        }

        int carChoice = scanner.nextInt() - 1; // Fix: Subtract 1 to match array index

        if (carChoice < 0 || carChoice >= carModels.length) { // Fix: Validate user input
            System.out.println("Invalid car choice.");
            return;
        }

        if (!isAvailable[carChoice]) {
            System.out.println("Sorry, this car is currently unavailable.");
        } else {
            double basePrice = basePrices[carChoice];
            int carAge = carAges[carChoice];
            System.out.println("Car model: " + carModels[carChoice]);
            System.out.println("Car age: " + carAge + " years");

            // Fix: Use ternary operator for age adjustment
            double ageAdjustment = (carAge > 5) ? 0.9 : 1.1;
            basePrice *= ageAdjustment;

            System.out.print("Enter rental duration in days: ");
            int days = scanner.nextInt();

            double totalPrice = basePrice * days;

            if (days > 7) {
                totalPrice *= 0.80;
            } else if (days > 3) {
                totalPrice *= 0.90;
            }

            double taxRate = 0.15;
            double totalWithTax = totalPrice * (1 + taxRate);

            System.out.println("Total price before tax: $" + totalPrice);
            System.out.println("Total price with tax: $" + totalWithTax);

            System.out.println("Select your car type:");
            for (int i = 0; i < carTypes.length; i++) {
                System.out.println((i + 1) + ". " + carTypes[i]);
            }

            int carTypeChoice = scanner.nextInt() - 1; // Fix: Subtract 1 to match array index

            double carTypeDiscount = getCarTypeDiscount(carTypeChoice); // Fix: Use separate method
            totalWithTax *= carTypeDiscount;

            System.out.println("Total price after car type discount: $" + totalWithTax);

            System.out.print("Enter your payment method (1 for Credit Card, 2 for PayPal): ");
            int paymentMethod = scanner.nextInt();

            processPaymentMethod(paymentMethod); // Fix: Use separate method
        }
    }

    // Fix: Move car type discount logic to a separate method
    private static double getCarTypeDiscount(int carTypeChoice) {
        switch (carTypeChoice) {
            case 0:
                return 0.95; // Economy
            case 1:
                return 0.85; // Luxury
            case 2:
                return 0.90; // Sports
            case 3:
                return 1.0;  // Utility
            default:
                return 1.2;  // Invalid choice
        }
    }

    // Fix: Move payment method logic to a separate method
    private static void processPaymentMethod(int paymentMethod) {
        switch (paymentMethod) {
            case 1:
                System.out.println("You chose Credit Card.");
                break;
            case 2:
                System.out.println("You chose PayPal.");
                break;
            default:
                System.out.println("Invalid payment method.");
                break;
        }
    }
}