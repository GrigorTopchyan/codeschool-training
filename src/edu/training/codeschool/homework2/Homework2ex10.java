package edu.training.codeschool.homework2;

public class Homework2ex10 {
    public static void main(String[] args) {
        int a[];
        int b[];
        int i;
        b = new int[6];
        a = new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        // Էս պիտի մինիմում ու մաքսիմում գտնես էս ինչ ես գրե՞լ
        //ողղի
        for(i=0;i< 6;i++)
            System.out.println(a[i]);
        System.out.println(" ");
        for (i=0; i < 6; i++)
            b[i]=a[5-i];
        for(i=0;i<6;i++)
            System.out.println(b[i]);
    }
}
