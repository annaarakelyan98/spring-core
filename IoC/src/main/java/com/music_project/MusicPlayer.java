package com.music_project;

public class MusicPlayer {
    Music music;

    //IoC//Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
