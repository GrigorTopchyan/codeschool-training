package homework2;

public class HomeTask19 {

    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6};
        int[] array1= {1,2,3,4,5,6};
        boolean equalOrNot = true;
        if(array.length == array1.length) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] != array1[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }if (equalOrNot) {
            System.out.println(" Equal");
        } else {
            System.out.println("Not equal");
        }
    }

}






