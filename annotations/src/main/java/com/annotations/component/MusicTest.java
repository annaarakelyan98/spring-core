package com.annotations.component;

public class MusicTest {
    private Music music;

    public MusicTest(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getMusic());
    }
}
