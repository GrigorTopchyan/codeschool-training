package homework2;

public class HomeTask20 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                System.out.println(arr[i] - 1);

            }
        }

    }
}
