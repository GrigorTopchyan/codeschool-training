package edu.codeschool.training.abstracts_extendes.homework5;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Myau - Myau");
    }
}
