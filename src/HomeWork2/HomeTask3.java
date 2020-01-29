package HomeWork2;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int pow=1;
        for (int i =0;i<m;i++){
            pow= pow * n;

        }
        System.out.println(pow);
    }
}
