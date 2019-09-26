package com.fish.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context= new ClassPathXmlApplicationContext("paringIdol.xml");
        Performer performer= (Performer) context.getBean("harry");
        performer.perform();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
