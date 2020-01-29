package homework1;

import java.util.Scanner;

public class HomeTask8 {
    public static void main(String[] args) {
        double n1 = 1.2, n2 = 1.4, n3 = 1.8, n4 = -2.4;
       double max = n1;
       if (n2 > max){
           max = n2;
       }  if (n3 > max){
            max = n3;
        }  if (n4 > max){
            max = n4;
        }
        System.out.println("The maximum number is " + max);
       double min = n2;
        if (n1 < min){
            min = n1;
        }  if (n3 < min){
            min = n3;
        }  if (n4 < min){
            min = n4;
        }
        System.out.println("The minimum number is " + min);
    }
}
