package homework2.hometask6;

public class HomeTask6 {
    /**
     *  6. Given array = {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15}.
     *                    Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {
        double[] arr = {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15};
        double average =0;
        //կարաս սաղ գումարես նոր վերջում բաժանես
        for (int i = 0; i <arr.length ; i++) {
            average+=arr[i]/arr.length;
        }
        System.out.println("average = "+average);
    }
}
