package homework2.hometask16;

public class HomeTask16 {
    /**
     * 16. Write a Java program to find the common elements between two arrays (int values)
     *                     ex. {1,2,3,4} {3,4,5,6} -> common value 3,4
     */
    public static void main(String[] args) {
int[] arr ={1,2,3,4,5};
int[] arr2 = {1,3,4,5,6,9,4};

        for (int i = 0; i <= arr.length-1 ; i++) {
            for (int j = 0; j <=arr.length-1 ; j++) {
                if (arr[i]==arr2[j]){
                    System.out.println("common value "+arr[i]);
            }
            }
        }
    }
}
