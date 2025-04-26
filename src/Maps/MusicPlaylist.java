package Maps;
import java.util.LinkedHashSet;

public class MusicPlaylist {
    private LinkedHashSet<String> playlist;

    public MusicPlaylist() {
        this.playlist = new LinkedHashSet<>();
    }

    public void addSong(String song) {
        if (this.playlist.add(song)) {
            System.out.println(song + " mahnısı əlavə olundu.");
        } else {
            System.out.println(song + " mahnısı artıq siyahıda var.");
        }
    }

    public void displayPlaylist() {
        System.out.println("Mahnı Siyahısı:");
        int i = 1;
        for (String song : this.playlist) {
            System.out.println(i + ". " + song);
            i++;
        }
    }
}
