package Books;
import java.util.ArrayList;
import java.util.List;

class FictionBook extends Book {
    String genre;

    public FictionBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("Genre: " + genre);
    }
}
