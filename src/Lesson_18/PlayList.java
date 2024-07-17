package Lesson_18;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<String> songs;

    public PlayList() {
        this.songs = new ArrayList<>();
    }
    public void addSong(String songName){
        songs.add(songName);
        System.out.println(songName + "has been added to the playlist.");
    }
    public void removeSong(String songName){
        songs.remove(songName);
        System.out.println(songName + "has been removed from the playlist.");
    }
    public void display(){
        System.out.println("Current Playlist: ");
        for (String song : songs){
            System.out.println(song);
        }
    }
}
