package homework2;

public class HomeTask20 {
    public static void main(String[] args) {

        int num;
        int[] numbers = new int[]{1,2,3,4,6,7,8,9,10};
        num = 11;
        int expected_num_sum = num * 5;
        int sum = 0;
        for (int i: numbers) {
              sum += i;

        }
       System.out.print( expected_num_sum - sum);

    }
}
