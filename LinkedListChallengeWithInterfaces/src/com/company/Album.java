package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private ArrayList<Song> song;

    public Album(String name) {
        this.name = name;
        song = new ArrayList<Song>();
    }

    public Song createSong(String albumName, String songTitle, double duration){
        if(this.name.equals(albumName)){
            Song newSong = new Song(songTitle,duration);
            this.song.add(newSong);
        }

        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playList){
        int index = trackNumber - 1;
        if((index>=0) && (index<=this.song.size())){
            playList.add(this.song.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
}
