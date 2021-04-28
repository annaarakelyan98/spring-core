package com.java_annotations;

import org.springframework.beans.factory.annotation.Qualifier;

public class MusicPlayer {
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic() {
        System.out.println(music1.getMusic() +
                " or " + music2.getMusic());
    }
}
