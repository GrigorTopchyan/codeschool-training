;

public class HomeTask8 {
    public static void main(String[] args) {
        double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0;
        if (n1 > n2 && n1 > n3 && n1 > n4)
        System.out.println(" max = 1.2");
        if (n1 < n2&&n1 < n3&&n1 < n4)
        System.out.println("min = 1.2");
        if (n2 > n1 && n2 > n3 && n2 > n4)
        System.out.println("max = 0.6");
        if (n2 < n1 && n2 < n3 && n2 < n4)
        System.out.println("min = 0.6");
        if (n3 > n1 && n3 > n2 && n3 > n4)
            System.out.println("max = -2.5");
        if (n3 < n1 && n3 < n2 && n3 < n4)
            System.out.println("min = -2.5");
        if (n4 > n1 && n4 > n2 && n4 > n3)
            System.out.println("max = 0");
        if (n4 < n1 && n4 < n2 && n4 < n3)
            System.out.println("min = 0");

    }
}
