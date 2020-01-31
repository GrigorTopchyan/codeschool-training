package HomeWork2;

public class HomeTask16 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 4, 6, 7, 5, 8};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("common value :" + array1[i]);
                }
            }
        }
    }
}