package Homework2;

public class HomeTask6 {

    public static void main(String[] args) {

        double [] numbers = {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15};

        double sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = (sum + numbers[i]);
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
