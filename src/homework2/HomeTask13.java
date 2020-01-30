package homework2;

public class HomeTask13 {
    public static void main(String[] args) {

        char[] array = {'a', 'A', 'N', '?', '.', 'P', 'v', 'T', 'f', '0', 'i', 'l', 'L', 'k', 'm', 'H'};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 64 && array[i] < 91) {
                sum = sum + 1;
            }

        }
        System.out.println(sum);

        }
    }
