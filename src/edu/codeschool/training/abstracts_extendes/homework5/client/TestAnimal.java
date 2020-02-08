package edu.codeschool.training.abstracts_extendes.homework5.client;

import edu.codeschool.training.abstracts_extendes.homework5.Akita;
import edu.codeschool.training.abstracts_extendes.homework5.Animal;
import edu.codeschool.training.abstracts_extendes.homework5.Cat;
import edu.codeschool.training.abstracts_extendes.homework5.Dog;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Tom"), new Dog("Barsik"), new Akita("Tommy"), new Cat("Lucy"),
                new Dog("Rex"), new Akita("Tony")};
        for (int i = 0; i < animals.length; i++) {
            animals[i].greeting();
        }
    }
}
