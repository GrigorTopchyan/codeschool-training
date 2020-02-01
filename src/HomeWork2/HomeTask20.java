package HomeWork2;

public class HomeTask20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        int n = array.length + 1;
        //Ապրի Գոռը ։D
        int sum = ((n + 1) * n / 2);
        for (int i = 0; i < array.length; i++) {
            sum = sum - array[i];

        }
        System.out.println(sum + "is missing");
    }

}



