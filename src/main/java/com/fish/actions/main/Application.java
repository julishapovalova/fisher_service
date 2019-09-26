package com.fish.actions.main;

import com.fish.actions.exception.QuestException;
import com.fish.actions.knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws QuestException {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

        Knight knight = context.getBean("knight", Knight.class);
        knight.embarkOnQuest();
//        context.close();
    }
}
