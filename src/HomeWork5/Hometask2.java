package HomeWork5;

import edu.training.codeschool.HomeWork4.classes_objects.MyMath;

public class Hometask2 {


    public void findNextPrime(int number) {
        boolean b = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {b=false;
                number = number + 1;}

                if (b) {
                    System.out.println("is prime");
                }
            }
        }
    }

