package LibrarysystemwithSets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class ReadingHistoryService {
    private Set<Book> readingHistory = new LinkedHashSet<>();

    public void bookRead(Book book) {
        // Remove if exists to reposition it at the end
        readingHistory.remove(book);
        readingHistory.add(book);
    }

    public List<Book> getRecentlyRead() {
        return new ArrayList<>(readingHistory);
    }

    public void displayHistory() {
        System.out.println("Reading History (most recent last):");
        for (Book book : readingHistory) {
            System.out.println(" - " + book);
        }
    }
}