package CaffeeMarket;

import java.util.List;

public class Order<T extends CoffeeProduct> {
    private Customer customer;
    private List<T> items;
    private double totalPrice;

    public Order(Customer customer, List<T> items, double totalPrice) {
        this.customer = customer;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<T> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order Details:\n");
        sb.append("Customer: ").append(customer.getName()).append("\n");
        sb.append("Items:\n");
        for (T item : items) {
            sb.append("- ").append(item.getName()).append(" - $").append(String.format("%.2f", item.getPrice())).append("\n");
        }
        sb.append("Total Price: $").append(String.format("%.2f", totalPrice));
        return sb.toString();
    }
}
