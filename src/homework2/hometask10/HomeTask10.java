package homework2.hometask10;

public class HomeTask10 {
    /**
     * 10. Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
     *                     Write a Java program to find the maximum and minimum value of an array.
     */
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max = array[i];
            }else if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("The maximum value = "+max);
        System.out.println("The minimum value = "+min);
    }
}
