package edu.training.codeschool;

public class App {
    public static void main(String[] args) {

        boolean a = false || m();

        System.out.println(a);
    }

    private static boolean m(){
        System.out.println("Inside method");
        return true;

    }
}
