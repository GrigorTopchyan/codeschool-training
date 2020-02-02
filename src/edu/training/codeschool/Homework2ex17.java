package edu.training.codeschool;

public class Homework2ex17 {
    public static void main(String[] args) {
        boolean a[];
        int i;
        int m=0;
        int n=0;
        a = new boolean[6];
        a[0]=true;
        a[1]=false;
        a[2]=false;
        a[3]=false;
        a[4]=true;
        a[5]=false;
        for(i=0;i<6;i++)
        { if(a[i]==true)
            n=n+1;
            if(a[i]==false)
                m=m+1;}
        System.out.println(n+"-true");
        System.out.println(m+"-false");
    }
}
