package homework2.hometask17;

public class HomeTask17 {
    /**
     * 17. Write a Java program to find the second largest and second smallest elements in an int array
     * ex. {4,5,7,8,3} -> 7is second largest element, second smallest 4
     */
    public static void main(String[] args) {
        int[] array = {449, 5, 200, 8, 3, 100};
        int firstMax = 0;
        int secondMax = 0;
//


        for (int i = 0; i < array.length; i++) {
            if ( array[i]>firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            }else if ( array[i]>secondMax) {

                secondMax = array[i];
            }
        }
        System.out.println(secondMax);
    }

}