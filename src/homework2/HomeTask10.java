package homework2;

public class HomeTask10 {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("maximal " + max);
        for (int j = 1; j <= array.length - 1; j++) {
        if (array[j] < min) {
            min = array[j];
        }
        }
        System.out.println("minimum "+min);
    }
}
