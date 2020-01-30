package homework1;

import java.util.Scanner;

public class HomeTask10 {
    public static void main(String[] args) throws IllegalStateException {

        int num1,num2,num3,num4;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int num = 0;
        switch(operator) {
            case '+':
                num = num1 + num2 + num3 + num4;
               break;
        }
        System.out.println(num);
    }
}
