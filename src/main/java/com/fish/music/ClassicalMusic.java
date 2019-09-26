package com.fish.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("musicClassicalBean")
public class ClassicalMusic implements Music {

    List<String> songs = new ArrayList<>(Arrays.asList("dfgdg", "sdgsdg", "dfsgdfg"));

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    public String getSong() {
        return songs.get(2);
    }
}
