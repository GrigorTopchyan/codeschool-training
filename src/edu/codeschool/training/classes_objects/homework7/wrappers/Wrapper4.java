package edu.codeschool.training.classes_objects.homework7.wrappers;

public class Wrapper4 {

    public static void main(String[] args) {


        Character c = '9';
        char ch = c;
        System.out.println("c = " + ch);


        System.out.println();

        //
        Character a = 'a';
        Character a2 = 'a';
        Character b ='b';

        int difference = a.compareTo(b);

        if (difference == 0) {
            System.out.println("a is equal to b.");
        } else if (difference < 0) {
            System.out.println("a is less than b.");
        } else if (difference > 0) {
            System.out.println("a is greater than b.");
        }
        System.out.println("a is "
                + ((a.equals(a2))));



        System.out.println();


        //
        String element = "el5";
        String s;
        s = "" + element.charAt(2);
        int x = Integer.parseInt(s);
        System.out.println(s);


        System.out.println();

        //
        char o ='A';
        x = (char) (o+1);
        System.out.println(x);
    }

}
