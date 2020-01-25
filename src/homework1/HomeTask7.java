package homework1;

public class HomeTask7 {
    public static void main(String[] args) {
        int a = 30;
        boolean first = a % 6 == 0;
        boolean second = a % 5 == 0;
        boolean result = first || second;
        System.out.println("Result = " + result);
    }
}
