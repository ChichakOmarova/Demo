package LibrarysystemwithSets;
public class LibrarySystemMain {
    public static void main(String[] args) {
        // Create instances of services
        LibraryCatalogService catalog = new LibraryCatalogService();
        ReadingHistoryService readingHistory = new ReadingHistoryService();
        WishlistService wishlist = new WishlistService();
        PopularityTrackerService popularityTracker = new PopularityTrackerService();

        // Create some books
        Book book1 = new Book("123456", "Java Programming");
        Book book2 = new Book("234567", "Data Structures");
        Book book3 = new Book("345678", "Algorithms");
        Book book4 = new Book("123456", "Java Programming - 2nd Edition"); // Same ISBN as book1
        Book book5 = new Book("456789", "Design Patterns");

        // Test LibraryCatalogService with HashSet
        System.out.println("\n--- TESTING LIBRARY CATALOG (HashSet) ---");
        catalog.addBook(book1);
        catalog.addBook(book2);
        catalog.addBook(book3);
        catalog.addBook(book4); // Should print warning (duplicate ISBN)
        catalog.displayCatalog();

        // Test ReadingHistoryService with LinkedHashSet
        System.out.println("\n--- TESTING READING HISTORY (LinkedHashSet) ---");
        readingHistory.bookRead(book1);
        readingHistory.bookRead(book2);
        readingHistory.bookRead(book3);
        readingHistory.displayHistory();
        System.out.println("\nReading book1 again (should move to end):");
        readingHistory.bookRead(book1);
        readingHistory.displayHistory();

        // Test WishlistService with LinkedHashSet
        System.out.println("\n--- TESTING WISHLIST (LinkedHashSet) ---");
        wishlist.addToWishlist(book3);
        wishlist.addToWishlist(book5);
        wishlist.addToWishlist(book2);
        wishlist.addToWishlist(book3); // Duplicate, shouldn't be added
        wishlist.displayWishlist();

        // Test PopularityTrackerService with TreeSet
        System.out.println("\n--- TESTING POPULARITY TRACKER (TreeSet) ---");
        popularityTracker.addRating(5);
        popularityTracker.addRating(3);
        popularityTracker.addRating(4);
        popularityTracker.addRating(5); // Duplicate, shouldn't be added
        popularityTracker.addRating(1);
        popularityTracker.displayRatings();
    }
}
