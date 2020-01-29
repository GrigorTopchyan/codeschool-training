package homework2.hometask9;

public class HomeTask9 {
    /**
     *    9. Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}.
     *                    Write a Java program to copy the array to another array.
     */
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] array2 = new int[array.length];
        for (int i = 0; i <=array.length-1 ; i++) {
            array2[i]=array[i];
            System.out.println(array2[i]);
        }
    }
}
