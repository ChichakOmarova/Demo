package task1easy;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");
        shoppingList.add("Pasta");

        System.out.println("Initial shopping list: " + shoppingList);
        System.out.println("\nFirst item: " + shoppingList.get(0));
        System.out.println("Last item: " + shoppingList.get(shoppingList.size() - 1));

        shoppingList.remove("Eggs");
        System.out.println("\nAfter removing Eggs: " + shoppingList);
        shoppingList.set(1, "Whole Wheat Bread");
        System.out.println("\nAfter updating Bread: " + shoppingList);
        System.out.println("\nPrinting all items with a loop:");
        for (String item : shoppingList) {
            System.out.println("- "+ item);
        }
        System.out.println("\nPrinting with index numbers:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i+1) + ". " + shoppingList.get(i));
        }
    }
}

