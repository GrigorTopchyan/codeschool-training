package HomeWork2;

public class HomeTask6 {
    public static void main(String[] args) {
        double averageValue =1  ;
        double [] array= {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15};
        double sum=0;

        for (int i =0 ; i < array.length;i++){
            sum = (array[i] +sum);
            //Էս կարաս վերջում գրես for ից հետո, որ ամեն անգամ չհաշվի average մի անգամ հաշվի


        }averageValue = sum /array.length;
        System.out.println(averageValue);
    }
}
