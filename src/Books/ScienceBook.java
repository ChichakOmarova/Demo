package Books;
import java.util.ArrayList;
import java.util.List;

class ScienceBook extends Book {
    String field;

    public ScienceBook(String title, String author, String isbn, String field) {
        super(title, author, isbn);
        this.field = field;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("Field: " + field);
    }
}
