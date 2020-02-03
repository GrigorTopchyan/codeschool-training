package homework2;

public class HomeTask17 {
    public static void main(String[] args) {

        int array[] = {10, 20, 25, 63, 96, 57};
        int x = array[0];
        int y = array[0];
        int streamline;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    streamline = array[i];
                    array[i] = array[j];
                    array[j] = streamline;
                }
            }
        }
        System.out.println(array[1]);
        System.out.println(array[4]);
    }
}