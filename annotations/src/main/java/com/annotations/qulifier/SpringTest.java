package com.annotations.qulifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        WorkerTest workerTest = context.getBean("workerTest", WorkerTest.class);
        workerTest.showWork();

        WorkerTest workerTest1 = context.getBean("workerTest", WorkerTest.class);
        workerTest1.showWork1();

        context.close();
    }
}
