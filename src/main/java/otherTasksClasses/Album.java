package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String albumName;
    List<Song> songs = new ArrayList<>();

    Album(String albumName) {
        this.albumName = albumName;
    }

    void showSongs() {
        for(Song pesna : songs) {
            System.out.println("В альбоме [" + albumName + "] есть песня: [" + pesna.title+"]");

        }
    }
}
