package udemy_exercises.songs;

import java.util.ArrayList;
import java.util.LinkedList;

class Album {
    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumTitle, String artistName) {
        title = albumTitle;
        artist = artistName;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkedSong: songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= songs.size())) {
            playList.add(songs.get(index));
            return true;
        }
        System.out.println("No valid track" + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Song " + title + " is not in this album");
        return false;
    }
}

/*
**Song Player w/ Java Classes**
     - **Album class** 
       - Playlist of **Songs**.
       - addPlayist() (songs must appear in the list in the order by which they were added)
       - stop()
       - nextSong()
       - previousSong()
       - repeatSong()
       - showPlaylist()
       - removePlaylist()
     - **A song must exist in an album before it can be added to the playlist (so you can only play songs that you own.)**
*/