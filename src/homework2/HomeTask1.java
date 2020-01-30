package homework2;

import java.util.Scanner;

public class HomeTask1 {
   public static void main(String[] args) {

      int i, n, sum = 0;
       n = 1000000;
         Scanner in = new Scanner(System.in);
         n = in.nextInt();

         for (i = 1; i <= n; i++) {
            System.out.print(i+" ");
            sum +=  i;
         }
      System.out.println();
      System.out.println(sum);
   }
}
