package com.fish.spitter.main;

import com.fish.spitter.Spitter;
import com.fish.spitter.SpitterDB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpitterMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spitter.xml");
        SpitterDB spitterDB = (SpitterDB) context.getBean("spitterDb");
        spitterDB.addSpitter(Spitter.builder()
                                    .username("bla")
                                    .password("bla")
                                    .fullName("Bla Bla")
                                    .build());

    }
}
