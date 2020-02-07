//Crete subclass of Dog with name Akita

package edu.codeschool.training.classes_objects.homework5;

public class Akita extends Dog {
    public Akita(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Akita is greeting");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
