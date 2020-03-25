package edu.training.codeschool.exceptions;

public class NumberFormatException {
    public static void main(String[] args) {
          String a = "12hj";
        try{
            System.out.println("begin");
           int num = Integer.parseInt(a);
            System.out.println(num);
        }catch (java.lang.NumberFormatException e){
            System.out.println(e);
        }finally {
            System.out.println("print anyway");
        }
        System.out.println("finish it all");
    }
}
