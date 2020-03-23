package HomeWork12.HomeTask1;


import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b =scanner.nextInt();
        int a=5;
        int c;
       try {
           c = a / b;
       }catch (java.lang.ArithmeticException ex){
           System.out.println("massage "+ex);
       }
    }


}


