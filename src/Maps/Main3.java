package Maps;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("\nTapşırıq 3: Son Ziyarət Edilən Səhifələr");
        RecentlyVisitedPages history = new RecentlyVisitedPages();
        history.visitPage(1, "google.com");
        history.visitPage(2, "facebook.com");
        history.visitPage(3, "youtube.com");
        history.visitPage(4, "twitter.com");
        history.visitPage(5, "linkedin.com");

        history.displayHistory();
    }
}