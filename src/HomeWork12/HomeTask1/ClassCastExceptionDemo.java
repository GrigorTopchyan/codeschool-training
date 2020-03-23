package HomeWork12.HomeTask1;

import HomeWork6.Employee;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
       try {
           Object a = Integer.valueOf(9);
           String b = (String) a;
       }catch (java.lang.ClassCastException e){
           System.out.println("Exception false cast " +e);
       }
    }
}
