package homework2;

public class HomeTask1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[1_000_000];
        for (int x = 1; x <= arr.length; x++) {
            int i = 0;
            arr[i] = x;


            if (arr[i] % 2 != 0) {
                 sum = sum + arr[i];
            }

            i++;
        }
        System.out.println(sum);


    }
}

