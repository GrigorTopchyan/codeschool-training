package homework1;

import java.util.Scanner;

//aschitable
public class HomeTask14 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
         String str = scanner.next();
         char ch = str.charAt(0);
         int i = ch - 32;
         if (ch > 97 && ch < 122){
             System.out.println((char)(i));


             if (ch > 65 && ch < 90){
                 System.out.println((char)(ch + 32));
             }
         }
    }

}

