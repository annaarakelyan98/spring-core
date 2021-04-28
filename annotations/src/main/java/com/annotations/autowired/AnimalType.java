package com.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//auto creating beans
@Component("animalType")
public class AnimalType {
    //dependency injection
    // with annotations
    private Hen hen;
    private Lion lion;

    @Autowired
    public AnimalType(Hen hen, Lion lion) {
        this.hen = hen;
        this.lion = lion;
    }

    //by field
    /* @Autowired*/
    private Animal animal;

    //by constructor
    /*  @Autowired*/
    public AnimalType(Animal animal) {
        this.animal = animal;
    }

    //by setter
    /*@Autowired*/
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

  /*  public void animalType() {
        System.out.println("Animal: " + animal.getAnimal());
    }*/

    public void animalType() {
        System.out.println("Animal: " + hen.getAnimal());
        System.out.println("Animal: " + lion.getAnimal());
    }

    public String anymalType1() {
        return  hen.getAnimal();
    }
}
