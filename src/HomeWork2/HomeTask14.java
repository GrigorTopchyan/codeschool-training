package HomeWork2;

import java.util.Scanner;

public class HomeTask14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();
    int sum=0;
    for (int i=firstNum;i<=secondNum;i++){
        if (i%2==0){
            System.out.println( "even number" +i);
        } else {sum=sum+i;}

    }System.out.println("sum of all odd numbers = " +sum);

}
}
