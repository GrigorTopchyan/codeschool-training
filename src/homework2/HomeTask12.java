package homework2;

public class HomeTask12 {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 3, 5, 6, 7, 6};
        for (int i = 0; i < array.length; i++) {
            //Խի ես j ն վերցրել i + 1 ի՞ց
            for (int j = 0 ; j < array.length+1; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}