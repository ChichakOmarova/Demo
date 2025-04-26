package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class RecentlyVisitedPages {
    private LinkedHashMap<Integer, String> history;

    public RecentlyVisitedPages() {
        this.history = new LinkedHashMap<>();
    }

    public void visitPage(int id, String website) {
        this.history.put(id, website);
        System.out.println(website + " səhifəsi ziyarət edildi.");
    }

    public void displayHistory() {
        System.out.println("Ziyarət edilən səhifələr:");
        for (Map.Entry<Integer, String> entry : this.history.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
}
