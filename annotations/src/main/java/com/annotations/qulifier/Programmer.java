package com.annotations.qulifier;

import org.springframework.stereotype.Component;

@Component("programmer")
public class Programmer implements Worker {
    @Override
    public String getWork() {
        return "Writing codes";
    }
}
