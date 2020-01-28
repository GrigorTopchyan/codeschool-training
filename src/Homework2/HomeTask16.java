package Homework2;

public class HomeTask16 {

    public static void main(String[] args) {

        int [] number1 = {1, 2, 3, 4};
        int [] number2 = {5, 6, 1, 2};
        for (int i = 0; i < number1.length ; i++) {
            for (int j = 0; j < number2.length ; j++)

                if(number1[i]==number2[j]){

                    System.out.println("The common elements between two arrays is :" + number1[i]);

                  }


            }
        }
    }
