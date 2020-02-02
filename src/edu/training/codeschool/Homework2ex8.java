package edu.training.codeschool;

public class Homework2ex8 {
    public static void main(String[] args) {
        int a[];
        int b[];
        int i;
        b = new int[9];
        a = new int[10];
        a[0]=25;
        a[1]=14;
        a[2]=56;
        a[3]=15;
        a[4]=36;
        a[5]=56;
        a[6]=77;
        a[7]=18;
        a[8]=29;
        a[9]=49;
        for(i=0;i<=9;i++)
            System.out.println(a[i]);
        System.out.println(" ");
        for (i=0; i < 4; i++)
            b[i]=a[i];
        for (i=4; i < 9; i++)
        b[i]=a[i+1];
        for(i=0;i<9;i++)
            System.out.println(b[i]);


    }
}
