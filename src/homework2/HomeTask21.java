package homework2;

import java.util.Arrays;

public class HomeTask21 {
    public static void main(String[] args) {

        int[] num = {8, 7, 2, 4, 9};
        System.out.println( Arrays.toString(num));
        int max = num[0];
        int min = num[0];
        float sum = num[0];
        for(int i = 1; i < num.length; i++) {
            sum  += num[i];
            if(num[i] > max)
                max = num[i];
            else if(num[i] < min)
                min = num[i];
        }
        float x = ((sum-max-min) / (num.length - 2));
        System.out.print(x);
    }
}
