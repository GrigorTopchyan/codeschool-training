package homework2;

public class HomerTask1 {
    public static void main(String[] args) {
        int sum=0;
        int i =1;
        for ( i=-1000000; i < 0; i++){
            if (i % 2 != 0) {
                sum = sum + i;


            }

        }
        System.out.println(sum);


    }
}