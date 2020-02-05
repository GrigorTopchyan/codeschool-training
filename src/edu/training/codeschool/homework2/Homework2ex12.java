package edu.training.codeschool.homework2;

public class Homework2ex12 {
    public static void main(String[] args) {
        char a[];
        int i;
        int j;
        a = new char[15];
        a[0]='a';
        a[1]='A';
        a[2]='N';
        a[3]='?';
        a[4]='P';
        a[5]='v';
        a[6]='T';
        a[7]='f';
        a[8]='0';
        a[9]='i';
        a[10]='1';
        a[11]='L';
        a[12]='k';
        a[13]='m';
        a[14]='H';
        for(i=0;i< 14;i++)
            System.out.println(a[i]);
        System.out.println(" ");
        for (i=0; i < 14; i++)
            if(a[i]>65 && a[i] <90)
                System.out.println(a[i]);
    }
}
