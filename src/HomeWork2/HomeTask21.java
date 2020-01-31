package HomeWork2;

public class HomeTask21 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int max = array[1];
        int min = array[2];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        double average = (sum - min - max) / (array.length - 2);
        System.out.println("The average value of an array of integers except the largest and smallest values");
        System.out.println(average);
    }
}