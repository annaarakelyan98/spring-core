package com.annotations.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("jazz", Music.class);

        MusicTest musicTest = new MusicTest(music);

        musicTest.playMusic();

        context.close();
    }
}
