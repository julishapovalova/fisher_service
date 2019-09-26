package com.fish.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerAutowiredExample {

    @Autowired
    @Qualifier("musicRockBean")
    private Music music1;

    @Autowired
    @Qualifier("musicClassicalBean")
    private Music music2;
//    private String name;
//    private int volume;
//

//    public MusicPlayerAutowiredExample( Music rockMusic) {
//        this.rockMusic = rockMusic;
//    }

    public String playMusic(TypeMusic typeMusic) {
        if (typeMusic == TypeMusic.ROCK)
            return music1.getSong();
        else
            return music2.getSong();
    }
}
