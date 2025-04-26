package CaffeeMarket;

import java.util.LinkedList;
import java.util.List;

public class Cart<T extends CoffeeProduct> {
    private List<T> items;

    public Cart() {
        this.items = new LinkedList<>();
    }

    public void addItem(T product) {
        this.items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeItem(int productId) {
        items.removeIf(item -> item.getId() == productId);
        System.out.println("Product with ID " + productId + " removed from cart.");
    }

    public List<T> getItems() {
        return items;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void clear() {
        this.items.clear();
        System.out.println("Cart cleared.");
    }
}
