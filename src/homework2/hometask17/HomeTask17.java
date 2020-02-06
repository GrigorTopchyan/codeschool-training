package homework2.hometask17;

public class HomeTask17 {
    /**
     * 17. Write a Java program to find the second largest and second smallest elements in an int array
     * ex. {4,5,7,8,3} -> 7is second largest element, second smallest 4
     */
    public static void main(String[] args) {
        int[] array = {4, 5, 117, 8, 3, 98, 100};
        int firstMax = array[0];
        int secondMax = array[0];
//
        //Նույն մինիմում մաքսիմումի նմանա բայց երկու հատ min երկու հատ max պիտի պահես
        //փորձի գրես

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i]>firstMax){
               firstMax=array[i];
            }

        }


        System.out.println(firstMax);
        for (int i = 0; i <=array.length-1 ; i++) {
            if (firstMax<array[i]){
                secondMax=firstMax;
                firstMax=array[i];
            }
        }
        System.out.println(secondMax);
    }

}