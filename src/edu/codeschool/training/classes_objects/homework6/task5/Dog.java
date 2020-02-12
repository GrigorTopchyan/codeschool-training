package edu.codeschool.training.classes_objects.homework6.task5;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }


    //greeting y xia name y veradarcnum
    @Override
    public String greeting() {
        return getName();
    }
}
