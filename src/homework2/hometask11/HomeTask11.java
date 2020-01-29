package homework2.hometask11;

public class HomeTask11 {
    /**
     * 11. Given the array = {1,2,3,4,5,6}.Write a Java program to reverse the array of int values
     * ex. {1,2,3,4,5,6} -> {6,5,4,3,2,1}
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int arr : array) {
            System.out.print(" " + arr + " ");

        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(" " + array[i] + " ");
        }
    }
}
