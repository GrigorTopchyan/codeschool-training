/*
5.2 Create class with name TestAnimal
  Create array of animal like Animal [] animals = {new Cat("C1"),new Dog("D1"),
  new Akita("A1"),new Cat("C2"),new Dog("D2"),new Akita("A2")}
  Iterate over array and call the greeting method for each object.

 */

package edu.codeschool.training.classes_objects.homework5;

import java.util.Arrays;

public class TestAnimal {

    public static void main(String[] args) {

        Animal [] animals = {new Cat("Cat"),new Dog("Dog"),new Akita("Akita")};

        for (int i = 0; i <animals.length ; i++) {

            //ստեղ պիտի greeting ը կանչեիր
            System.out.println(animals[i]);
        }


        //Սրանից հետոն էլ պետք չի
        System.out.println();


        Cat cat = new Cat("Gerry");
        Dog dog = new Dog("Rex");
        Akita akita = new Akita("Laika");

        cat.greeting();
        dog.greeting();
        akita.greeting();


       }


    }

