package HomeWork12.HomeTask1;

import java.util.Arrays;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
       Object a =null;
      try {
          a.toString();
      }catch (java.lang.NullPointerException e ){
          System.out.println("massage" + e);
      }
    }
}
