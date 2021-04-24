package com.beans_lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        PlayGame playGame = context.getBean("playGame", PlayGame.class);
        playGame.playGame();

        Football football = context.getBean("football", Football.class);
        System.out.println("Game is: " + football.sportType());

        context.close();
    }
}
