package com.fish.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayerAutowiredExample musicPlayer;

    @Autowired
    public Computer(MusicPlayerAutowiredExample musicPlayer) {
        id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMusic(TypeMusic.ROCK) +
                '}';
    }
}
