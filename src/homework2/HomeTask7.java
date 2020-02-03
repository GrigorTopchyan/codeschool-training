package homework2;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index;
        int[] array = {1, 25, 8, 6, 4, 5, 56, 55, 8, 68, 45, 62, 66, 82, 63, 33, 3, 7, 71, 32};
        for (int i = 0; i <= array.length - 1; i++) {
            if (n == array[i]) {
                index = i;
                System.out.println("The array contains the specific value");
            }else if (n != array[i]){
                    System.out.println("The array does not contain the value");
                }
                break;
        }
    }
}