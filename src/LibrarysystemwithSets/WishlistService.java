package LibrarysystemwithSets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class WishlistService {
    private Set<Book> wishlist = new LinkedHashSet<>();

    public boolean addToWishlist(Book book) {
        return wishlist.add(book);
    }

    public boolean removeFromWishlist(Book book) {
        return wishlist.remove(book);
    }

    public List<Book> getWishlist() {
        return new ArrayList<>(wishlist);
    }

    public void displayWishlist() {
        System.out.println("Wishlist:");
        for (Book book : wishlist) {
            System.out.println(" - " + book);
        }
    }
}