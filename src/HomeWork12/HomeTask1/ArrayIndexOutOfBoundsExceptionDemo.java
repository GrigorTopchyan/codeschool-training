package HomeWork12.HomeTask1;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int [] array = {1,2,3};
      try {
          for (int i = 0; i <5 ; i++) {
              array[i]=i;
          }
      } catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Massage false index" + e);
      }

    }



}
