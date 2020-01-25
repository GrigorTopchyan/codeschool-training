package edu.training.codeschool;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.omg.CosNaming.IstringHelper;

public class HomeTask1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        int c = 15;
        int d = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(b % a);
        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        c *= d;
        System.out.println(c);
        c /= d;
        System.out.println(c);
        d %= c;
        System.out.println(d);


    }
}