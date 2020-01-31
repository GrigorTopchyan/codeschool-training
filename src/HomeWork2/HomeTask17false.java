package HomeWork2;

public class HomeTask17false {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }

        }
        for (int j =0;j<array.length;j++){
            for(int f =0;f<array.length;f++){
            if(array[f]<array[j]&&array[j]<max){
                System.out.println("Ddd");
            }
        }
    }

}
}
