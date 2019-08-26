package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Rock");

        album.createSong("Rock", "Lily",2.10);
        album.createSong("Rock", "Rose",3.11);
        album.createSong("Rock", "Petunia",1.02);
        album.createSong("Rock", "Ivy",0.55);
        album.createSong("Rock", "Morning Glory",4.00);
        albums.add(album);

        Album newAlbum = new Album("Jazz");
        newAlbum.createSong("Jazz", "Road",6.10);
        newAlbum.createSong("Jazz", "Room",5.45);
        newAlbum.createSong("Jazz", "Bar",4.23);
        newAlbum.createSong("Jazz", "Roof",4.21);
        newAlbum.createSong("Jazz", "Walls",10.00);
        albums.add(newAlbum);

        List<Song> playList = new Vector<Song>();
        albums.get(0).addToPlaylist(2, playList);
        albums.get(0).addToPlaylist(3, playList);
        albums.get(0).addToPlaylist(5, playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(5, playList);

        play(playList);
    }

    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlist Complete");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
//                case 4:
//                    printList(playList);
//                    break;
//                case 5:
//                    printMenu();
//                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
}
