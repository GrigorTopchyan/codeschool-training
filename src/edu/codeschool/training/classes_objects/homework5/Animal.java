/*
 5.1 Create abstract class Animal which has one private field nam of type String and abstract method greeting();
     Create one constructor with name parameter
     Create subclass of Animal with name Cat
     Create subclass of Animal with name Dog
     Crete subclass of Dog with name Akita
     Override grreting() method in all subclasses

 */

package edu.codeschool.training.classes_objects.homework5;

public  abstract class Animal {


    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greeting();


    @Override
    public String toString() {
        return "Animal {" +
                "name='" + name + '\'' +
                '}';
    }
}
