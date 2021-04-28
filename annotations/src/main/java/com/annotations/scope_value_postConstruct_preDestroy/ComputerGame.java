package com.annotations.scope_value_postConstruct_preDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*
@Scope("singleton")
*/
@Scope("prototype")
public class ComputerGame implements Game {
    @Override
    public String getGame() {
        return "Need for speed";
    }
}
