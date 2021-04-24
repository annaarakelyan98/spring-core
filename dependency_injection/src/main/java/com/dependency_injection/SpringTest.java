package com.dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //dependency injection by constructor
        MusicPlayer musicPlayer = context.getBean("constructorMusic", MusicPlayer.class);
        musicPlayer.playMusic();

        //dependency injection by setter 1
        MusicPlayer musicPlayer1 = context.getBean("setMusicRef", MusicPlayer.class);
        musicPlayer1.playMusic();

        //dependency injection by setter 2
        MusicPlayer musicPlayer2 = context.getBean("setMusicHand", MusicPlayer.class);
        System.out.println(musicPlayer2.getName() + ": " + musicPlayer2.getVolume());

        //dependency injection by setter 3
        MusicPlayer musicPlayer3 = context.getBean("setMusicProperties", MusicPlayer.class);
        System.out.println(musicPlayer3.getName() + ": " + musicPlayer3.getVolume());

        context.close();
    }
}
