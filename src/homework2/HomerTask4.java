package homework2;

import java.util.Scanner;

public class HomerTask4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        int n = in.nextInt();
        //Երկրորդ System.out.print("Input  number: "); ը պետք չի
        System.out.print("Input  number: ");

        int i = 1;

        //Սխալա աշխատում պահանջը ասումա եթե թիվը պարզա տպի պարզա հակառակ դեպքում տպի պարզ չի
        //Ստեղ լիքը տպումա պարզա, պարզ չի
        //փորձի ուղես դասի ժամանակ էլ ենք արել
        for (i = 2; i < n; i++ ) {
            if (n % i != 0)
            {
                System.out.println("The number is prime");
            }else{
                System.out.println("The number is not prime");
            }

        }


    }
}

