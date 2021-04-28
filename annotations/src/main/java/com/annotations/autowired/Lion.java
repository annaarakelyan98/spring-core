package com.annotations.autowired;

import org.springframework.stereotype.Component;

@Component("lion")
public class Lion implements Animal {
    @Override
    public String getAnimal() {
        return "Lion is wild";
    }
}
