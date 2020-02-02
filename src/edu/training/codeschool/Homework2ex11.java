package edu.training.codeschool;

public class Homework2ex11 {
    public static void main(String[] args) {
        int a[];
        int i;
        int j;
        a = new int[8];
        a[0]=1;
        a[1]=2;
        a[2]=5;
        a[3]=5;
        a[4]=6;
        a[5]=6;
        a[6]=7;
        a[7]=2;
        for(i=0;i< 8;i++)
            System.out.println(a[i]);
        System.out.println(" ");
        for (i=0; i < 8; i++)
            for(j=i+1; j < 8; j++)
                if(a[i]==a[j])
                    System.out.println("Duplicate value is: "+a[i]);
    }
}
