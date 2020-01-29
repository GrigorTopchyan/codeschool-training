package homework2;

public class HomerTask6 {
    public static void main(String[] args) {
        double[] numbers = new double[]{1.2d, 2.2d, 5.5d, 4.5d, 5, 7.8d, 8.5d, 7, 5.1d, 3.15d};
        double total = 0;
        for (double i = 0; i < numbers.length; i++) {
            total = total + numbers[(int) i];
        }
        double average = total/numbers.length;
        System.out.println("average value of array elements ="+average);
    }


}

