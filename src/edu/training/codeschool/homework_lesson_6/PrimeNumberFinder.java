package edu.training.codeschool.homework_lesson_6;

public class PrimeNumberFinder {
    public static void main(String[] args) {
            int k = 21;
            for (int i = 0; i<10; i++){
                if (finder(k++)){
                    break;
                }
            }
        System.out.println(k-1);


    }





    public static boolean finder(int num){
        for (int i = 2; i < num/2 ; i++) {
            if (num%i == 0){
               return false;
            }
        }
        return true;
    }



}
