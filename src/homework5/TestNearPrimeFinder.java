package homework5;

import java.util.Scanner;

import static homework5.nearPrimeFinder.find;

public class TestNearPrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int primeNumber = find(i);
        System.out.println(primeNumber);

    }
}
