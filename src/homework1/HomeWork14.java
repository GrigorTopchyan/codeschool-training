package homework1;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        System.out.println("Mutqagreq cankacac tar/ mecatar kam poqratar");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        char ch = x.charAt(0);
        int i = ch - 32;
        int y = ch + 32;
        if (ch > 97 && ch < 122) {
            System.out.println((char) i);
        }
        else if (ch > 65 && ch < 90) {
            System.out.println((char) y);
        }
    }
}

