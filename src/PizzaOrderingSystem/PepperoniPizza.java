package PizzaOrderingSystem;

public class  PepperoniPizza extends Pizza {
    public PepperoniPizza(String size) {
        super(size,  "Pepperoni");

    }

    public double calculatePrice() {
        switch (size.toLowerCase()) {
            case "kiçik":
                return  6.49;
            case "orta":
                return  9.99;
            case "böyük":
                return 12.99;
            default:
                System.out.println("Etibarsız ölçü.");
                return 0;
        }
    }
}
