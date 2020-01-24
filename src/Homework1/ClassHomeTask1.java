package Homework1;

public class ClassHomeTask1 {
    public static void main(String[] args) {


        /*
         1.   Given two digits (int, double, float, long, short), write a program using ALL(+,-,/,*,%,+=,-=,*=,/=, %=) Arithmetic
         */

        int i = 5;
        int b = 7;
        System.out.println("I+B result is : " + (i+b));

        byte q = 126;
        byte w = 12;
        System.out.println("Q-W result is : " + (q-w));


        short r = 120;
        short d = 20;
        System.out.println("R/d result is : " + (r/d)) ;


        long l = 345667;
        long o = 223232323;
        System.out.println("L*0 result is : " + (l*o));


        float f = 12.2322323f;
        double df = 23.34343434343;
        System.out.println("DF % F result is : " + df%f);


        int p = 234;
        int m = 23;
        System.out.println("P%M resilt is : " + p%m);



        int test = 6;

        if(test >=9){
            System.out.println(false);
        }else if(test<=10){
            System.out.println(true);
        }else{
            System.out.println("no one");
        }



        long l1 = 23456433;
        long l2 = 343332222;

        long l3 = l1 += 4;
        long l4 = l2 -= 5;
        System.out.println("result is : "+ l3);
        System.out.println("result is : "+ l4);



        int i1 = 25;
        int i2 = 45;
        int result1 = i1 /+ 5;
        int result2 = i2 %= 6;

        System.out.println("result is : " + result1);
        System.out.println("result is : "+ result2);


           }


        }









