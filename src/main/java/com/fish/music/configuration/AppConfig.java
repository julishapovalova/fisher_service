package com.fish.music.configuration;

import com.fish.music.MusicPlayerAutowiredExample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MusicPlayerAutowiredExample musicPlayerAutowiredExample(){
        return new MusicPlayerAutowiredExample();
    }
}
