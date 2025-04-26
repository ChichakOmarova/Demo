package LibrarysystemwithSets;
import java.util.HashSet;
import java.util.Set;

class LibraryCatalogService {
    private Set<Book> catalog = new HashSet<>();

    public boolean addBook(Book book) {
        if (catalog.contains(book)) {
            System.out.println("Warning: Book with ISBN " + book.getIsbn() + " already exists in the catalog.");
            return false;
        }
        catalog.add(book);
        return true;
    }

    public Set<Book> getAllBooks() {
        return catalog;
    }

    public void displayCatalog() {
        System.out.println("Library Catalog:");
        for (Book book : catalog) {
            System.out.println(" - " + book);
        }
    }
}