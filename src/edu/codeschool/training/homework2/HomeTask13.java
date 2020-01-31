package edu.codeschool.training.homework2;

//Given an array of chars array = {'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'}.
//                     Write a Java program to count the number of uppercase letters from array of chars.

public class HomeTask13 {
    public static void main(String[] args) {
        char[] array = {'a', 'A', 'N', '?', '.', 'P', 'v', 'T', 'f', '0', 'i', 'l', 'L', 'k', 'm', 'H'};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 64 && array[i] < 91) {
                sum = sum + 1;
            }

        }
        System.out.println("Sum of uppers number is =" + sum);
    }
}
