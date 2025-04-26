package Books;
import java.util.ArrayList;
import java.util.List;

//main
public class LibrarySystem {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("Harry Potter", "J.K. Rowling", "978-0747532699", "Fantasy");
        ScienceBook scienceBook = new ScienceBook("A Brief History of Time", "Stephen Hawking", "978-0553380163", "Physics");

        LibraryMember alice = new LibraryMember("Alice");

        alice.borrowBook(fictionBook);
        alice.borrowBook(scienceBook);

        alice.displayBorrowedBooks();

        alice.returnBook(fictionBook);

        alice.displayBorrowedBooks();
    }
}
