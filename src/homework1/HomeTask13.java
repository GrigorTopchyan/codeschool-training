package homework1;

import java.util.Scanner;

public class HomeTask13 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        int num1 = in.nextInt();
        if (num1% 5==0||num1% 6==0){
            System.out.println("nume1");}
        else {
            System.out.println("nam1 not divided into 5 or 6 ");
        }
    }
}
