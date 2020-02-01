package homework2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial = " + factorial);
    }

    //Էս ինչ որ տեղից օգտվել ե՞ս
    //հասկացել ես ոնցա աշխատու՞մ
    //սենց մի գրի փոխի for ով գրի
    static int fact(int n) {
        int number;
        if (n == 1) {
            return 1;
        }
        number= fact(n - 1) * n;
        return number;
    }
}
