package edu.training.codeschool.homework_lesson_5_feb_02.homework_9;

public class TestMyMath {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int[] intArray = {1, 2, 8, 3, 6, 5, 4, 7, 8, 9};
        double[] doubleArray = {1.5, 2.9, 8.9, 3.1, 6.2, 5.8, 4.7, 7.0, 8.78, 9.01};
        int num = 17;
        System.out.println("min of int array " + math.min(intArray));
        System.out.println("max of int array " + math.max(intArray));
        System.out.println("sum of int array " + math.sum(intArray));
        System.out.println("min of double array " + math.min(doubleArray));
        System.out.println("min of double array " + math.max(doubleArray));
        System.out.println("min of double array " + math.sum(doubleArray));
        System.out.println(math.isPrime(num));
    }
}
