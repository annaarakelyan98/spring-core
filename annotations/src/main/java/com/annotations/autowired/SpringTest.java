package com.annotations.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        AnimalType animalType = context.getBean("animalType",AnimalType.class);
        animalType.animalType();

        Farm farm = context.getBean("farm",Farm.class);
        System.out.println(farm);

        context.close();
    }
}
