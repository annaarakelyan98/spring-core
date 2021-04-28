package com.annotations.component;

import org.springframework.stereotype.Component;

@Component("jazz")
public class JazzMusic implements Music {
    @Override
    public String getMusic() {
        return "Stumbling Down";
    }
}
