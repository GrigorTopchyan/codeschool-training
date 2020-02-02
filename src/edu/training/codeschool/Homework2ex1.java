package edu.training.codeschool;

public class Homework2ex1 {
    public static void main(String[] args) {
        int i;
        int s=0;
        for(i=1;i<=1000000;i=i+2)
            s=s+i;
        System.out.println("the sum="+s);
    }
}

