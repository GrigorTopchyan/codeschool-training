package edu.training.codeschool.homework_for_09_02_2020.homework_5;

public abstract class Animal {
    private String name;

    //es constructory petq chi
    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void greeting();


}
