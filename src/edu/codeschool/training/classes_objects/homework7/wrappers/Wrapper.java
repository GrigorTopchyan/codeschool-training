package edu.codeschool.training.classes_objects.homework7.wrappers;

public class Wrapper {
    public static void main(String[] args) {

        Integer i = 10;
        int i1 = i;
        System.out.println(i1);

        //
        Character c = 'a';
        char c1 = c;
        System.out.println(c1);

        //
        Double d = 123.76;
        double d1 = d;
        System.out.println(d1);


        //
        Boolean bool = true;
        boolean bool1 = bool;
        System.out.println(bool1);

        //
        Integer I = Integer.valueOf("10");
        System.out.println(I);

        //
        int x = Integer.parseInt("9");
        double parseDouble = Double.parseDouble("5");
        int b = Integer.parseInt("4", 10);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);


    }

}
