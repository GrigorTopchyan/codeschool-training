package homework2.hometask12;

public class HomeTask12 {
    /**
     *    12. Given array = {1, 2, 5, 5, 6, 6, 7, 2}.
     *                     Write program that prints duplicate values of the array.
     *                     So the output should be:
     *                               Duplicate value is: 5
     *                               Duplicate value is: 6
     */


    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};
        for (int i = 0; i < array.length - 1 ; i++) {
            if (array[i+1]==array[i]){
                System.out.println("Duplicate value is: " +array[i]);
            }
        }
    }
}
