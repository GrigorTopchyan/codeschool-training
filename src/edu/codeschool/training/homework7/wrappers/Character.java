package edu.codeschool.training.homework7.wrappers;

public class Character {
    char aChar;

    void uppercase(char letter){
        if (letter > 64 && letter < 91){
            System.out.println("The letter is uppercase");
        }else {
            System.out.println("The letter is lowercase");
        }
    }

}
