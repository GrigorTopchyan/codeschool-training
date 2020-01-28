package homework1;

public class HomeTask9 {
    public static void main(String[] args) {
//        a. -5 + 8 * 6
        int a = -5;
        int b = 8;
        int c = 6;
        //փոփողականի անունը փոքրատառով պիտի սկսվի (CamelCase)
        int D = a + b * c;
        System.out.println("the answer is " + D);

//        b. (55+9) % 9
        int a1 = 55;
        int b1 = 9;
        int c1 = 9;
        int D1 = (a1 + b1) % c1;
        System.out.println("the answer is " + D1);
//        c. 20 + -3*5 / 8
        double a2 = 20;
        double b2 = -3;
        double c2 = 5;
        double e = 8;
        double D2 = a2 + b2 * c2 / e;
        System.out.println("the answer is " + D2);
//        d. 5 + 15 / 3 * 2 - 8 % 3
        float a3 = 5;
        float b3 = 15;
        float c3 = 3;
        float e1 = 2;
        float s = 8;
        float y = 3;
        float D3 = a3 + (b3 / c3 * e1) - (s % y);
        System.out.println("the answer is " + D3);
    }
}
