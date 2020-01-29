package HomeWork1;

public class HomeTask1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        int c = 15;
        int d = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b % a = " + (b % a));
        a += b;
        System.out.println("a = " + a);
        a -= b;
        System.out.println("a = " + a);
        c *= d;
        System.out.println("c = " + c);
        c /= d;
        System.out.println("c = " + c);
        d %= c;
        System.out.println("d = " + d);


    }
}