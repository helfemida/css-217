package assignment8.iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();
        playlist.addSong(new Song("Cry Me A River", "Justin Timberlake"));
        playlist.addSong(new Song("Castle", "Halsey"));
        playlist.addSong(new Song("Mooz", "Ninety One"));

        Iterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}

