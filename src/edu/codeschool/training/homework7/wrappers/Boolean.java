package edu.codeschool.training.homework7.wrappers;

public class Boolean {
    boolean b;
    boolean isNegative(int number){
        java.lang.Boolean aBoolean = new java.lang.Boolean("true");
        if (number > 0){
            return false;
        }
            return true;

    }
    boolean isPrime(int number){
        for (int i = 2; i > 0 ; i++) {
            if (number % i != 0){
                return true;
            }
        }return false;
    }
    boolean isOdd(int number){
        Boolean b = fromString("gggg");
        System.out.println(b);
        if (number % 2 != 0){
            return false;
        }
        return true;
    }
    Boolean v(boolean y){
        Boolean c = new Boolean();
        if (y){
            c.b = true;
        }else {
            c.b = false;
        }
        return c;
    }

    Boolean fromString(String s){
        Boolean c = new Boolean();
        c.b = s.equals("true");
        return c;
    }

    @Override
    public String toString() {
        return b + "";
    }
}
