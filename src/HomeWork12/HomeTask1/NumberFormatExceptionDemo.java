package HomeWork12.HomeTask1;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
       try {
           Integer.parseInt("a");
       }catch (java.lang.NumberFormatException e ){
           System.out.println("massage" +e );
       }
    }
}
