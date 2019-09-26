package com.fish.music;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class MusicPlayer {

    private List<Music> listOfMusic = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    //IoC

    public MusicPlayer(List<Music> listOfMusic) {
        this.listOfMusic = listOfMusic;
    }

    public void playMusic() {
        listOfMusic.forEach(music -> System.out.println(music.getSong()));
    }
}
