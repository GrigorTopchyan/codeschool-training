package edu.codeschool.training.classes_objects.homework6.task5;

public class TestAnimal {
    public static void main(String[] args) {

        Animal[] animals = {new Cat("C1"),new Dog("D1"),new Akita("A1"),new Cat("C2"),
                new Dog("D2"),new Akita("A2")};
        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i].greeting());
        }
    }
}