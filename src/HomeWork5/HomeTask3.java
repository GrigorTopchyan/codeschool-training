package HomeWork5;

public class HomeTask3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("array" + i + "=" + array[i]);
        }
//   NVAZMAN KARGI HAMAR ;
        int x;
        int y;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }

            }

        }
        System.out.println("nvazman kargov");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        //           ACHMAN KARGI HAMAAR
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    y = array[i];
                    array[i] = array[j];
                    array[j] = y;
                }

            }

        }
        System.out.println("\n" + "achman kargov");
        for (int j = 0; j < array.length; j++) {

            System.out.print(+array[j]);

        }
    }
}
