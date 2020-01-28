import java.util.Scanner;

public class Hometask13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x == 0) {
            System.out.println("Zero");
        }
        if (x > 0) {
            System.out.println("Positive");
        }
        if (x < 0) {
            System.out.println("Negative");
        }
        if (x > -1 && x < 1) {
            System.out.println("small");
        }
        if (x > 1000000 && x < -1000000) {
            System.out.println("big");
        }
    }}