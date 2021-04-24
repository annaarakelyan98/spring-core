package com.beans_lifecycle;

public class Football implements Sport {
    private Football(){}

    public static Football getGame(){
        return new Football();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String sportType() {
        return "Football";
    }
}
