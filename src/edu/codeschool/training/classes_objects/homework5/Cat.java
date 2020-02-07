//Create subclass of Animal with name Cat

package edu.codeschool.training.classes_objects.homework5;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Cat is greeting");
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
