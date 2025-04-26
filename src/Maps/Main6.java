package Maps;
public class Main6 {
    public static void main(String[] args) {
        System.out.println("\nTapşırıq 6: Musiqi Siyahısı");
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong("Mahni 1");
        playlist.addSong("Mahni 2");
        playlist.addSong("Mahni 3");
        playlist.addSong("Mahni 2"); // Dublikat
        playlist.addSong("Mahni 4");
        playlist.addSong("Mahni 5");

        playlist.displayPlaylist();
    }
}
