package Books;
import java.util.ArrayList;
import java.util.List;

class LibraryMember {
    String name;
    List<Book> borrowedBooks;

    public LibraryMember(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        book.borrowBook();
        if (book.isBorrowed) {
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        if (!book.isBorrowed) {
            borrowedBooks.remove(book);
        }
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                book.displayBookInfo();
                System.out.println("---");
            }
        }
    }
}
