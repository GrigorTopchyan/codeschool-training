package homework1;

import java.util.Scanner;

public class HomeTask17 {
    public static void main(String[] args) {

        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        scanner.close();
        int output;
        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:

                return;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);

    }
}
