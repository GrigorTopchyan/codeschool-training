package HomeWork2;

public class HomeTask8 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49,};
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                array[array.length - 1] = 0;
            } else if (i >= 4) {
                array[i] = array[i + 1];
            }
            System.out.println(array[i]);
        }
    }

}



