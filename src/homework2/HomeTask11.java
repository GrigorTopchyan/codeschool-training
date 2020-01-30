package homework2;

import java.util.Scanner;

public class HomeTask11 {
    public static void main(String[] args) {

        int array=123456;
        System.out.println(array);
        int reversenum = 0;
        while( array != 0 ) {
            reversenum = reversenum * 10;
            reversenum = reversenum + array % 10;
            array = array / 10;
        }

        System.out.println(reversenum);
    }
}
