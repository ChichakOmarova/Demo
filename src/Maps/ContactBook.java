package Maps;

import java.util.HashMap;

public class ContactBook {
    private HashMap<String, String> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        this.contacts.put(name, phoneNumber);
        System.out.println(name + " əlaqəsi əlavə olundu.");
    }

    public void searchContact(String name) {
        if (this.contacts.containsKey(name)) {
            String phoneNumber = this.contacts.get(name);
            System.out.println(name + ": " + phoneNumber);
        } else {
            System.out.println(name + " tapılmadı.");
        }
    }

    public void updatePhoneNumber(String name, String newPhoneNumber) {
        if (this.contacts.containsKey(name)) {
            this.contacts.put(name, newPhoneNumber);
            System.out.println(name + " nömrəsi yeniləndi.");
        } else {
            System.out.println(name + " tapılmadı.");
        }
    }
}

