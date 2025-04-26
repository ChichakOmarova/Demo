package PizzaOrderingSystem;

public class Pizza {
    String size;
    String toppings;
    public Pizza (String size,String toppings){
        this.size= size;
        this.toppings=toppings;
    }
    public double calculatePrice(){
        return 0;
    }
    public void printDetails(){
        System.out.println("Pizza: " + size);
        System.out.println("Ödəniş: " + calculatePrice());

    }

}
