package edu.training.codeschool;

public class Homework2ex18 {
    public static void main(String[] args) {
        int a[];
        int b[];
        int i;
        boolean c = false;
        b = new int[6];
        a = new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;

        b[0]=1;
        b[1]=8;
        b[2]=3;
        b[3]=9;
        b[4]=5;
        b[5]=6;
        for(i=0;i< 5;i++)
            if (a[i]==b[i])
                c=true;
          else  {c=false;
          break;}
        if(c)
            System.out.println("are equal");
        if(!c)
            System.out.println("are not equal");
    }
}
