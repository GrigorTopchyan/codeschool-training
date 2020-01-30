package homework1;

public class HomeTask8 {
    public static void main(String[] args) {

        double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0;
        double max = n3;
        double min = n1;
        if (n1 > max) {
            max = n1;
        }if (n2 > max) {
            max = n2;
        }if (n3 > max) {
            max = n3;
        }if (n4 > max) {
            max = n4;
        }System.out.println("min ="+max);
        if (n1 < min) {
            min = n1;
        }if (n2 < min) {
            min = n2;
        }if (n3 < min) {
            min = n3;
        }if (n4 < min) {
            min = n4;
        }System.out.println("min =" + min);
        }
        }



