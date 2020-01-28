import java.util.Scanner;

public class Hometask7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println();
        // if-else-if
        if (x % 5 == 0 || x % 6 == 0) {
            System.out.println("The digit divides onto 5 and 6(for if-else-if)");
        } else System.out.println("The digit doesn't divide onto 5 and 6(for if-else-if)");
        //if-nested-if
        if (x % 5 == 0 || x % 6 == 0) {
            System.out.println("The digit divides onto 5 and 6(for if-nested-if)");
        }
        if (x % 5 != 0 || x % 6 != 0) {
            System.out.println("The digit doesn't divide onto 5 or 6(for if-nested-if)");
        }
    }
}
