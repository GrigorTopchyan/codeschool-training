package homework2.hometask7;

import java.util.Scanner;

public class HomeTask7 {
    /**
     * 7. Given array = {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32} and n(Input n from console).
     * Write a Java program that prints the index of the n if the array contains the specific value.
     * Otherwise prints "The array does not contain the value"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrValue = scanner.nextInt();
        int index;

        int[] array = {1, 25, 3, 6, 4, 5, 56, 55, 8, 68, 45, 62, 66, 82, 63, 33, 3, 7, 71, 32};
        for (int i = 0; i <= array.length - 1; i++) {

            //Երբ գտար break օգտագործի որ դուրս գաս ցիկլից, որովհետև անիմաստա շարունակելը
            if (arrValue == array[i]) {
                index = i;
                System.out.println(arrValue + " index is: " + index);
            }
        }
    }
}

