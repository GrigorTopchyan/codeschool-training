package homework1.hometask16;

import java.util.Scanner;

public class HomeTask16 {
    /**
     * Գրել հաշվիչ ծրագիր, որը կառաջարկի մուտքագրել 2 թիվ և 1 մաթեմատիկական գործողություն և կտպի արդյունքը էկրանին․
     * Թվերը կարող են լինել int,double,float
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter one of the arithmetic Operators +,-,*,/,% :");
        String symbol = scanner.nextLine();

        System.out.println("Enter number 2: ");
        double number2 = scanner.nextDouble();
boolean isRightSymbol= true;
//while (isRightSymbol){
//    if (symbol.charAt(1)=='+'){
//        double sum = number1+number2;
//        System.out.println(sum);
//    }else {
//        isRightSymbol=false;
//    }
//}
    }
}
