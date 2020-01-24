package homework1;

public class HomeTask8 {
    public static void main(String[] args) {
        double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0;
        double max, max1;
        double min, min1;
        if (n1 > n2){
            max = n1;
            min = n2;
        }else {
            max = n2;
            min = n1;
        }
        if (n3 > n4){
            max1 = n3;
            min1 = n4;
        }else {
            max1 = n4;
            min1 = n3;
        }
        if (max1 > max){
            System.out.println("The maximum number is " + max1);

        }else{
            System.out.println("The maximum number is " + max);
        }
        if (min < min1){
            System.out.println("The minimum number is " + min);
        }else{
            System.out.println("The minimum number is " + min1);
        }
    }
}
