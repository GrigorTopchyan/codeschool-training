package homework2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] arr = new int[number];
        int y = 0;
        for (int x = 1; x <= arr.length; x++){
            arr[y] = x;
            System.out.println(arr[y]);
            y++;

        }

    }
}
