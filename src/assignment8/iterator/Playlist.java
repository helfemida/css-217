package assignment8.iterator;

public interface Playlist {
    Iterator createIterator();
    void addSong(Song song);
}