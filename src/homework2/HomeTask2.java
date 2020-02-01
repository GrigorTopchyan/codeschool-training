package homework2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fac = 1;
        //Պետք չի արայ սարքել
        int[] arr = new int[number];
        int y = 0;
        for (int x = 1; x <= arr.length; x++){
            arr[y] = x;
            fac = fac * arr[y];
            y++;
        }
        System.out.println(fac);
    }
}
