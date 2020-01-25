package edu.training.codeschool;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.sql.SQLOutput;
import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        System.out.println("Home!!! ");
        byte b = 10;
        short a = 23;
        int c = b + a + 5;
        long myLongValue = 10_00_000L;
        float myFloatVal = 24.34f;
        double myDoubleVal = 456.987;
        double h = a + b + 2.3;
        double sam = a + b + c + myFloatVal + myDoubleVal;
        double New = h / 3;
        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '\u00A9';

        boolean b1 = true;
        boolean b2 = false;
        String s = "some string  " +"some other string";
        System.out.println("s ="+s);
        System.out.println("Characters");
        System.out.println("charsss" + char1 + char2 + char3 + char4);
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("New = " + New);
        System.out.println("Result = " + sam);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("int h = " + h);
        System.out.println("myDoubleVal" + myDoubleVal);
        System.out.println("myLongValue =" + myLongValue);
    }
}
