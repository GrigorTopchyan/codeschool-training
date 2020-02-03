package homework2;

public class HomeTask11 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int[] array1 =new int [6];
        for (int i = array.length ; i >=(array.length / 2 - 2); i--) {
            System.out.print(i+",");
        }
    }
}
