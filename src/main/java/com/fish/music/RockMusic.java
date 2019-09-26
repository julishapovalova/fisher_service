package com.fish.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component("musicRockBean")
public class RockMusic implements Music {

    List<String> songs = new ArrayList<>(Arrays.asList("dfgdg", "sdgsdg", "dfsgdfg"));
    //    private RockMusic() {
//
//    }

    public static RockMusic rockMusic() {
        return new RockMusic();
    }

    public String getSong() {
        return songs.get(1);
    }
}
