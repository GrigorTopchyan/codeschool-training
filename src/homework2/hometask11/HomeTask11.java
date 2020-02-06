package homework2.hometask11;

public class HomeTask11 {
    /**
     * 11. Given the array = {1,2,3,4,5,6}.Write a Java program to reverse the array of int values
     * ex. {1,2,3,4,5,6} -> {6,5,4,3,2,1}
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[array.length];


        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
        }

        for (int arr : array) {
            System.out.print(" " + arr + " ");

        }
    }
}
