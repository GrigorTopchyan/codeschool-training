package edu.codeschool.training.abstracts_extendes.homework5;

public class Dog  extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Gaf - Gaf");
    }
}
