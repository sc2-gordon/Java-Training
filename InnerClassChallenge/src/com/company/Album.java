package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private SongList song;

    public Album(String name) {
        this.name = name;
        song = new SongList();
    }

    public Song createSong(String albumName, String songTitle, double duration){
        if(this.name.equals(albumName)) {
            song.createSong(songTitle, duration);
        }

        return null;
    }

    public void addToPlaylist(int trackNumber, LinkedList<Song> playList){
        song.addToSonglist(trackNumber,playList);
    }
    
    private class SongList {
        private ArrayList<Song> song;

        private SongList() {
            song = new ArrayList<Song>();
        }

        private void createSong(String songTitle, double duration){
                Song newSong = new Song(songTitle, duration);
                this.song.add(newSong);
        }

        private boolean addToSonglist(int trackNumber, LinkedList<Song> playList){
            int index = trackNumber - 1;
            if((index>=0) && (index<=this.song.size())) {
                playList.add(this.song.get(index));
                return true;
            }
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }

    }


}
