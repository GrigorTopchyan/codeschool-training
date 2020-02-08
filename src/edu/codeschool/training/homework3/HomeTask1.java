package edu.codeschool.training.homework3;

import edu.codeschool.training.classes_objects.homework4.MyMath;

//կլասսի անունը էլ HomeTask1 մի գրի
//անունը պիտի հնարաորինս համապատասխանի թե կլասսը ինչի համարա
//օրինակ կարա լինի NextPrimeFinder
public class HomeTask1 {
    //main մեթոդը իրա մեջ մի գրի
    //առանձին կլասս սարքի տեստ անելու համար օրինակ NextPrimeFinderTest
    public static void main(String[] args) {
        System.out.println(HomeTask1.nextNumberPrime(8));

    }

    // isPrime ը կարա private լինի մենակ ստեղ ես օգտագործում
    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int nextNumberPrime(int number) {
        int i = 1;
        while (true) {
            //ստեղ isPrime ը կարաս միանգամից դիմես առանց կլասսի անունը նշելու
            //քանի որ հենց էս կլասսի մեջա հայտարարած
            if (HomeTask1.isPrime(number + i)) {
                return number + i;
            }
            i++;
        }
    }
}