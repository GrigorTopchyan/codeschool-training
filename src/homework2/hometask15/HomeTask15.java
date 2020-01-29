package homework2.hometask15;

public class HomeTask15 {

    /**
     * 15. Create a JAVA program to print the numbers that
     * divide to 3 from 10 to 100, both included, except the numbers that divide to 7.
     */
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 100;
        while (firstNumber <= secondNumber) {
            if (firstNumber % 3 == 0 && firstNumber % 7 != 0) {
                System.out.print(" " + firstNumber + " ");
            }
            firstNumber++;


        }


    }

}
