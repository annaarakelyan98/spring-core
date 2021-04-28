package com.annotations.autowired;

import org.springframework.stereotype.Component;

@Component("hen")
public class Hen implements Animal {
    @Override
    public String getAnimal() {
        return "Hen is domestic";
    }
}
