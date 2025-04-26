package Maps;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Tapşırıq 1: Əlaqə Kitabı");
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Əli", "050-123-45-67");
        contactBook.addContact("Vəli", "055-987-65-43");
        contactBook.addContact("Sara", "070-234-56-78");
        contactBook.addContact("Kamal", "051-345-67-89");
        contactBook.addContact("Nərmin", "099-765-43-21");

        contactBook.searchContact("Vəli");
        contactBook.searchContact("Əhməd"); // Olmayan ad

        contactBook.updatePhoneNumber("Sara", "077-111-22-33");
        contactBook.searchContact("Sara");
    }
}
