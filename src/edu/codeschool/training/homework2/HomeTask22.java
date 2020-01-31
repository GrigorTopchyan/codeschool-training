package edu.codeschool.training.homework2;

//Write a Java program to test if an long array contains a specific long value (use break keyword if value is found).

public class HomeTask22 {
    public static void main(String[] args) {
        long[] a1 = {2131232121, 213123123, 231231231, 546456464};
        long n = 2131232121;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == n) {
                System.out.println(a1[i]);
            }
            break;
        }

    }
}
