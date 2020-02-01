package edu.training.codeschool.homework_for_29_01_2020.homework_13;

public class UpperCaseCounter {
    //մեթոդի անունը էտքան էլ լավը չի
    //կարա լինի օրինակ upperCaseCharacterCount
    public static int counter(char[] arr){
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 65 && arr[i] < 92){
                ++counter;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        char[] arr = {'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H','C', 'F'};
        System.out.println("quantity of UpperCase letters : " + counter(arr));
    }
}
