package com.annotations.scope_value_postConstruct_preDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlayGame {
    @Value("${gamePlayer.name}")
    private String name;

    @Value("${gamePlayer.thing}")
    private String thing;

    public String getName() {
        return name;
    }

    public String getThing() {
        return thing;
    }
}
