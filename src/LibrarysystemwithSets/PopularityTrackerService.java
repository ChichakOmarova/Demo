package LibrarysystemwithSets;
import java.util.Set;
import java.util.TreeSet;

class PopularityTrackerService {
    private Set<Integer> ratings = new TreeSet<>();

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public Set<Integer> getAllRatings() {
        return ratings;
    }

    public void displayRatings() {
        System.out.println("Book Ratings (sorted):");
        for (Integer rating : ratings) {
            System.out.println(" - " + rating + " stars");
        }
    }
}
