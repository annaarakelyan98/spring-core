package com.annotations.scope_value_postConstruct_preDestroy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SportGame implements Game {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getGame() {
        return "Basketball";
    }
}
