package HomeWork2;

public class HomeTask10 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        int min = array[1];
        if (array[0] < min) {
            min = array[0];
        }
        if (array[2] < min) {
            min = array[2];
        }
        if (array[3] < min) {
            min = array[3];
        }
        if (array[4] < min) {
            min = array[4];
        }
        if (array[5] < min) {
            min = array[5];
        }
        if (array[6] < min) {
            min = array[6];
        }
        if (array[7] < min) {
            min = array[7];
        }
        if (array[8] < min) {
            min = array[8];
        }
        if (array[9] < min) {
            min = array[9];
        }
        System.out.println("MIN = " + min);


        if (array[1] > max) {
            max = array[1];
        }
        if (array[2] > max) {
            max = array[2];
        }
        if (array[3] > max) {
            max = array[3];
        }
        if (array[4] > max) {
            max = array[4];
        }
        if (array[5] > max) {
            max = array[5];
        }
        if (array[6] > max) {
            max = array[6];
        }
        if (array[7] > max) {
            max = array[7];
        }
        if (array[8] > max) {
            max = array[8];
        }
        if (array[9] > max) {
            max = array[9];
        }
        System.out.println("MAX =  " + max);
    }
}
