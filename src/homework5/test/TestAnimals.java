package homework5.test;

import homework5.animals.Akita;
import homework5.animals.Animal;
import homework5.animals.Cat;
import homework5.animals.Dog;

/**
 * 5.2 Create class with name TestAnimal
 *                             Create array of animal like Animal [] animals = {new Cat("C1"),new Dog("D1"),new Akita("A1"),new Cat("C2"),new Dog("D2"),new Akita("A2")}
 *                             Iterate over array and call the greeting method for each object.
 */
public class TestAnimals {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("C1"),new Dog("D1"),new Akita("A1"),new Cat("C2"),new Dog("D2"),new Akita("A2")};
        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i].greeting());
        }
    }
}
