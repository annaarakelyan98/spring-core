package com.beans_lifecycle;

public class PlayGame {
    private Sport sport;

    public PlayGame(Sport sport) {
        this.sport = sport;
    }

    public void playGame() {
        System.out.println("Playing: " + sport.sportType());
    }
}
