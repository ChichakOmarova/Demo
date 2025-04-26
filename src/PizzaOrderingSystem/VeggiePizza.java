package PizzaOrderingSystem;

public class VeggiePizza extends Pizza {
    public VeggiePizza(String size) {
        super(size,  "Veggie");
    }

    public double calculatePrice() {
        switch (size.toLowerCase()) {
            case "kiçik":
                return  5.49;
            case "orta":
                return  8.49;
            case "böyük":
                return 10.99;
            default:
                System.out.println("Etibarsız ölçü.");
                return 0;
        }
    }
}