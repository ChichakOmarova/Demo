package PizzaOrderingSystem;

import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pizza növünü seçin (Margherita, Pepperoni, Veggie):");
        String pizzaType = scanner.nextLine();

        System.out.println("Ölçünü seçin (Kiçik, Orta, Böyük):");
        String size = scanner.nextLine();

        Pizza pizza;

        switch (pizzaType.toLowerCase()) {
            case "margherita":
                pizza = new MargheritaPizza(size);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(size);
                break;
            case "veggie":
                pizza = new VeggiePizza(size);
                break;
            default:
                System.out.println("Etibarsız pizza növü.");
                return;
        }
        pizza.printDetails();
        System.out.println("Sifariş uğurla yerləşdirildi!");
        scanner.close();
    }
}
