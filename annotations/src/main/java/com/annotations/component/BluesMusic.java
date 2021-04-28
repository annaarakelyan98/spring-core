package com.annotations.component;

import org.springframework.stereotype.Component;

@Component("blues")
public class BluesMusic implements Music {
    @Override
    public String getMusic() {
        return "Sweet Home Chicago";
    }
}
