package com.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Farm {
    private int id;
    private AnimalType animalType;

    @Autowired
    public Farm(AnimalType animalType) {
        this.id = 1;
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal " + id + ": " + animalType.anymalType1();
    }
}
