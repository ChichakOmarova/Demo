package Generic;

public class UserMain {
    public static void main(String[] args) {
        // Create user
        User user = new User("Chichak", 324);

        // Create contact with phone
        UserDetail<User, String> contact = new UserDetail<>(user, "055-123-45-67");

        // Print contact info
        System.out.println("=== Contact Information ===");
        System.out.println("User: " + contact.getKey());
        System.out.println("Phone: " + contact.getValue());

        // Another example with age
        UserDetail<User, Integer> ageContact = new UserDetail<>(
                new User("Nazrin", 786), 33
        );

        System.out.println("\n=== Age Information ===");
        System.out.println("User: " + ageContact.getKey());
        System.out.println("Age: " + ageContact.getValue());
    }
}
//5