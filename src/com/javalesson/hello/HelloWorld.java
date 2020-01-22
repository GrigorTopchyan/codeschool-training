package com.javalesson.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        byte a = 15;
        short b = 124;
        int c = a - b;
        long myLongVal = 12987654L;

        float myFloatVal = 15.7F;
        double myDoubleVal = 32.18D;


        System.out.println("abba a = " + a);
        System.out.println("karel b =" + b);
        System.out.println("int c =" + c);

        double sam = a + b + c + myLongVal + myDoubleVal;
        System.out.println("sam =" + sam);

        float myNewFloat = myFloatVal / 3;
        System.out.println("myNewFloat =" + myNewFloat);

        double myNewDouble = 15.7;

        double myResaultDouble = myNewDouble / 3;
        System.out.println(myNewDouble / 3);

        char char1 = 'a';
        char char2 = 'B';
        char char3 = '\n';
        char char4 = '/';
        char char5 = '\u00B6';

        System.out.println("Characters");
        System.out.println("char1" + char1);
        System.out.println("char2" + char2);
        System.out.println("char3" + char3);
        System.out.println("char4" + char4);
        System.out.println("char5" + char5);

        System.out.println("Sum of Characters");
        System.out.println("chars-" + char1 + char2 + char3 + char4 + char5);


        boolean b1 = true;
        boolean b2 = false;

        String s = "Sum other string" + " Sum string";
        System.out.println(s);


        short someShort = b;
        System.out.println("someShort" + someShort);
        int someInt = someShort;
        System.out.println("someShort" + someInt);
        someShort = (short) someInt;
        System.out.println("someShort" + someShort);

        someInt = (int) myLongVal;
        System.out.println("someInt=" + someInt);

        double someIntDouble = someInt;
        System.out.println("someIntDouble =" + someInt);


    }

}
