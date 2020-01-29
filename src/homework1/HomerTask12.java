package homework1;

public class HomerTask12 {
    public static void main(String[] args) {
        double n1 = 1.2;
        double n2 = 0.6;
        double n3 = -2.5;
        double n4 = 0;
        if (n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println("max = " + n1);
        } else if (n2 > n3 && n2 > n4) {
            System.out.println("max =" + n2);
        } else if (n3 > n4) {
            System.out.println("max = " + n3);

        } else {
            System.out.println("max = " + n4);
        }
        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("min = " + n1);
        } else if (n2 < n3 && n2 < n4) {
            System.out.println("min =" + n2);
        } else if (n3 < n4) {
            System.out.println("min = " + n3);

        } else {
            System.out.println("min = " + n4);
        }
    }
}




