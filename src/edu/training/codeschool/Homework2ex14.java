package edu.training.codeschool;

public class Homework2ex14 {
    public static void main(String[] args) {
        int i;
        int n=10;
        int m=100;
        for(i=n;i<m;i++)
            if(i%3==0 && i%7!=0)
                System.out.println(i);

    }
}

