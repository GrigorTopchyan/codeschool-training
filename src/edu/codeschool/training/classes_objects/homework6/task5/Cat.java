package edu.codeschool.training.classes_objects.homework6.task5;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    //xia name y veradarcnum ?
    @Override
    public String greeting() {
        return super.getName();

    }
}
