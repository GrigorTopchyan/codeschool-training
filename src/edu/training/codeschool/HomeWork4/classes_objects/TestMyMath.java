package edu.training.codeschool.HomeWork4.classes_objects;

public class TestMyMath {
    public static void main(String[] args) {
        int [] intArray  = {1,2,8,3,6,5,4,7,8,9};
        double [] doubleArray  = {1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01};
        MyMath math=new MyMath();
        MyMath.isPrime(1489775697);
        MyMath.max(intArray);
        MyMath.max(doubleArray);
        MyMath.min(intArray);
        MyMath.min(doubleArray);
        MyMath.mull(intArray);
        MyMath.mull(doubleArray);
        MyMath.sum(intArray);
        MyMath.sum(doubleArray);

    }
}
