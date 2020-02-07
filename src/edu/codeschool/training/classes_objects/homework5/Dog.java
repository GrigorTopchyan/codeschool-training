//Create subclass of Animal with name Dog

package edu.codeschool.training.classes_objects.homework5;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Dog is greeting");
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
