package HomeWork2;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = {1, 25, 8, 6, 4, 5, 56, 55, 8, 68, 45, 62, 66, 82, 63, 33, 3, 7, 71, 32};
        //պահանջը ասումա պարզել տրված թիվը արայում կա թէ չէ ու եթե կա որ ինդեքսումա
        //սենց սխալա աշխատում փորձի ուղղես
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("The array contain " + n + " index = " + i);
            }

        }System.out.println("The array does not contain the value");
    }
}