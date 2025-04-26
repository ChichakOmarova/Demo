package CaffeeMarket;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CaffeeMarketmain {

    private static List<CoffeeProduct> productCatalog = new ArrayList<>();
    private static Cart<CoffeeProduct> cart = new Cart<>();
    private static List<Customer> customers = new ArrayList<>();
    private static Customer currentCustomer = null;
    private static List<Order<CoffeeProduct>> orderHistory = new ArrayList<>();

    public static void main(String[] args) {
        productCatalog.add(new CoffeeProduct(1, "Espresso", 3.50));
        productCatalog.add(new CoffeeProduct(2, "Latte", 4.00));
        productCatalog.add(new CoffeeProduct(3, "Cappuccino", 4.20));
        customers.add(new Customer(101, "Mehin", "mehin@example.com"));
        customers.add(new Customer(102, "Bob", "bob@example.com"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CaffeeMarket!");

        System.out.println("\nLogin:");
        System.out.print("Enter your ID: ");
        try {
            int customerId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            currentCustomer = customers.stream().filter(c -> c.getId() == customerId).findFirst().orElse(null);
            if (currentCustomer == null) {
                System.out.println("Invalid customer ID. Exiting.");
                return;
            }
            System.out.println("Welcome, " + currentCustomer.getName() + "!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number for your ID. Exiting.");
            return;
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        viewProducts();
                        break;
                    case 2:
                        addProductToCart(scanner);
                        break;
                    case 3:
                        removeProductFromCart(scanner);
                        break;
                    case 4:
                        viewCart();
                        break;
                    case 5:
                        placeOrder();
                        break;
                    case 6:
                        System.out.println("Thank you for visiting CaffeeMarket!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }

    private static void viewProducts() {
        System.out.println("Available Coffee:");
        for (CoffeeProduct product : productCatalog) {
            System.out.println(product);
        }
    }

    private static void addProductToCart(Scanner scanner) {
        System.out.print("Enter Product ID to add to cart: ");
        try {
            int productId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            CoffeeProduct selectedProduct = productCatalog.stream()
                    .filter(product -> product.getId() == productId)
                    .findFirst()
                    .orElse(null);

            if (selectedProduct != null) {
                cart.addItem(selectedProduct);
            } else {
                System.out.println("Invalid Product ID.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number for the Product ID.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void removeProductFromCart(Scanner scanner) {
        if (cart.getItems().isEmpty()) {
            System.out.println("Your cart is empty. Nothing to remove.");
            return;
        }
        System.out.println("Items in your cart:");
        int i = 1;
        for (CoffeeProduct item : cart.getItems()) {
            System.out.println(i + ". " + item.getName() + " (ID: " + item.getId() + ")");
            i++;
        }
        System.out.print("Enter the ID of the product to remove: ");
        try {
            int productIdToRemove = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            cart.removeItem(productIdToRemove);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number for the Product ID.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void viewCart() {
        List<CoffeeProduct> itemsInCart = cart.getItems();
        if (itemsInCart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in Cart:");
            for (CoffeeProduct item : itemsInCart) {
                System.out.println("- " + item.getName() + " - $" + String.format("%.2f", item.getPrice()));
            }
            System.out.println("Total: $" + String.format("%.2f", cart.calculateTotalPrice()));
        }
    }

    private static void placeOrder() {
        if (cart.getItems().isEmpty()) {
            System.out.println("Your cart is empty. Please add items before placing an order.");
            return;
        }

        System.out.println("Items in Cart:");
        for (CoffeeProduct item : cart.getItems()) {
            System.out.println("- " + item.getName() + " - $" + String.format("%.2f", item.getPrice()));
        }
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total: $" + String.format("%.2f", totalPrice));

        System.out.print("Confirm order? (yes/no): ");
        Scanner scanner = new Scanner(System.in);
        String confirmation = scanner.nextLine().toLowerCase();

        if (confirmation.equals("yes")) {
            if (currentCustomer != null) {
                Order<CoffeeProduct> newOrder = new Order<>(currentCustomer, new ArrayList<>(cart.getItems()), totalPrice);
                System.out.println("\nOrder placed. Thank you!");
                System.out.println(newOrder); // Display order details
                orderHistory.add(newOrder); // Optional: Track order history
                cart.clear();
            } else {
                System.out.println("Error: No customer logged in.");
            }
        } else {
            System.out.println("Order cancelled.");
        }
    }
}
