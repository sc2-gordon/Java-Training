package com.company;

public class Walls {
    private String wallpaper;
    private int wallFaces;

    public Walls(String wallpaper, int wallFaces) {
        this.wallpaper = wallpaper;
        this.wallFaces = wallFaces;
    }

    public void displayWall() {
        System.out.println("The wall is currently display the " + this.wallpaper + " wallpaper on all " + this.wallFaces + " sides of the room.");
    }

    public String getWallpaper() {
        return wallpaper;
    }

    public int getWallFaces() {
        return wallFaces;
    }
}
