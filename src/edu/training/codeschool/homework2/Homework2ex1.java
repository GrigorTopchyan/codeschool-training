package edu.training.codeschool.homework2;

public class Homework2ex1 {
    public static void main(String[] args) {
        int i;
        //փոփոխականներին լավ անուներ տուր օրինակ ստեղ կարար լիներ sum ոչ թէ s
        int s=0;
        //for ից հետո միշտ {} թակագծերը դիր
        for(i=1;i<=1000000;i=i+2)
            s=s+i;
        System.out.println("the sum="+s);
    }
}

