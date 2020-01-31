package HomeWork2;

public class HomeTask18 {
    public static void main(String[] args) {
        boolean[] array = {true, true, false, false, false, true, true};
        int sumt = 0;
        int sumf = 0;
        boolean a = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                sumt++;
            } else {
                sumf++;
            }
        }
        System.out.println(sumt + "true");
        System.out.println(sumf + "false");
    }
}
