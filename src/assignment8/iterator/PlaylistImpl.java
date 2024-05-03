package assignment8.iterator;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {
    private List<Song> songs;

    public PlaylistImpl() {
        this.songs = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new SongIterator();
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    // Step 5: Define the Iterator implementation
    private class SongIterator implements Iterator {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < songs.size();
        }

        @Override
        public Song next() {
            if (hasNext()) {
                return songs.get(position++);
            }
            return null;
        }
    }
}
