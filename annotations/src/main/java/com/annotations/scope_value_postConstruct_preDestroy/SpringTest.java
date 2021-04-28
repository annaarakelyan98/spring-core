package com.annotations.scope_value_postConstruct_preDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //value
        PlayGame playGame = context.getBean("playGame", PlayGame.class);

        System.out.println("Game is: " + playGame.getName());
        System.out.println("Game play with: " + playGame.getThing());

        //scope
        ComputerGame computerGame1 = context.getBean("computerGame", ComputerGame.class);
        ComputerGame computerGame2 = context.getBean("computerGame", ComputerGame.class);

        boolean isTrue = computerGame1 == computerGame2;
        if (isTrue) {
            System.out.println("singleton type: refer to the same object");
        } else {
            System.out.println("prototype: refer to different objects");
        }

        //postConstruct and preDestroy
        SportGame sportGame = context.getBean("sportGame",SportGame.class);

        context.close();
    }
}
