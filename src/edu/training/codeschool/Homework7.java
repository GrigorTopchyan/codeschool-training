package edu.training.codeschool;

public class Homework7 {
public static void main(String[] args) {
            double n1 = 1.2D;
            double n2 = 0.6D;
            double n3 = -2.5D;
            double n4 = 0.0D;
            double min = n1;
            if (n1 > n2) {
                min = n2;
            }

            if (min > n3) {
                min = n3;
            }

            if (min > n4) {
                min = n4;
            }

            double max = n1;
            if (n1 < n2) {
                max = n2;
            }

            if (max < n3) {
                max = n3;
            }

            if (max < n4) {
                max = n4;
            }

            System.out.println("min=" + min);
            System.out.println("max=" + max);
        }
    }


