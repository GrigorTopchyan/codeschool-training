package edu.training.codeschool.myownstring;

public class MyStringTest {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        MyString myString = new MyString(array);
        System.out.println(myString.charAt(152));
    }
}
