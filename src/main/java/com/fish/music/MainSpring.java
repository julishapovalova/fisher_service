package com.fish.music;

import com.fish.music.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "springContext.xml"
        );

//        TestBean test = context.getBean("testBean", TestBean.class);
//        System.out.println(test.getName());
//
//
//        Music rockMusic = context.getBean("musicRockBean", RockMusic.class);
//        System.out.println(rockMusic.getSong());
//
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println("MusicPlayer1 ");
//        musicPlayer1.playMusic();
//
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
//        musicPlayer2.playMusic();
//
//        System.out.println(musicPlayer2.getName());
//        System.out.println(musicPlayer2.getVolume());
//
//
//        MusicPlayer musicPlayer3 = context.getBean("musicPlayer3", MusicPlayer.class);
////        MusicPlayer musicPlayer4 = context.getBean("musicPlayer3", MusicPlayer.class);
////        System.out.println(musicPlayer3==musicPlayer4);
//        System.out.println("MusicPlayer3 ");
//        musicPlayer3.playMusic();
//
//        System.out.println(musicPlayer3.getName());
//        System.out.println(musicPlayer3.getVolume());
//
//        musicPlayer3.setVolume(99);
//        System.out.println(musicPlayer3.getVolume());
//        System.out.println(musicPlayer4.getVolume());
//        System.out.println("===================");
//        MusicPlayerAutowiredExample autowiredExample = context.getBean("musicPlayerAutowiredExample", MusicPlayerAutowiredExample.class);
//        autowiredExample.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
