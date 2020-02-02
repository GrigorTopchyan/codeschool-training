package homework2;

import java.util.Scanner;

public class HomeTask1 {
   public static void main(String[] args) {

      int i, n, sum = 0;
      //Պետք չի էլ n ին արժեք տալ scanner ով տալու ես հետո
       n = 1000000;
         Scanner in = new Scanner(System.in);
         n = in.nextInt();

         for (i = 1; i <= n; i++) {
             //Պետք չի i տպել տենց պահանջ չկա
            System.out.print(i+" ");
             //կենտ թվերի գումարնա ուզում ոչ թէ բոլոր թվերինը
            sum +=  i;
         }
      System.out.println();
      System.out.println(sum);
   }
}
