package HomeWork2;

public class HomeTask9 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
            System.out.println("newarray" + i + "=" + newarray[i]);
            System.out.println("array   " + i + "=" + array[i]);
        }


    }
}
