package com.annotations.qulifier;

import org.springframework.stereotype.Component;

@Component("farmer")
public class Farmer implements Worker {
    @Override
    public String getWork() {
        return "Growing animals";
    }
}
