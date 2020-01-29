package edu.training.codeschool.homework_for_29_01_2020.homework_1;

public class SummaryOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            if (i%2 ==1){
                sum  = sum + i;
            }
        }
        System.out.println(sum);
    }
}
