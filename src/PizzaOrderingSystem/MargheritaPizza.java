package PizzaOrderingSystem;

public class MargheritaPizza extends Pizza {
    public MargheritaPizza(String size) {
        super(size,  "Margherita");
    }

    public double calculatePrice() {
        switch (size.toLowerCase()) {
            case "kiçik":
                return  5.99;
            case "orta":
                return  8.99;
            case "böyük":
                return 11.99;
            default:
                System.out.println("Etibarsız ölçü.");
                return 0;
        }
    }
}
