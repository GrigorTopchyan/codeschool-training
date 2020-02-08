package edu.training.codeschool.homework_lesson_6;

public class PolyndromCheck {
    public static void main(String[] args) {
        int num = 121;
        int n;
        int sum = 0;
        while (num>0){
            n = num%10;
            sum=(sum*10)+n;
            num = num/10;
        }
        if (sum == num){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
    }
}
