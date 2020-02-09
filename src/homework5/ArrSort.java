package homework5;

public class ArrSort {

    //պիտի մեթոդ գրես որ ստանա երկու սորտավորված արրայ և վերադարձնի դրանց միավորված արայը
    //փոխի
    public static void main(String args[]) {
        int array[] = {1, 2, 4, 5, 6};
        int array1[] = {2, 3, 5, 7};
        int a = array.length;
        int b = array1.length;
        int i = 0, j = 0;
        while (i < a && j < b) {
            if (array[i] < array1[j])
                System.out.print(array[i++]+", ");
            else if (array1[j] < array[i])
                System.out.print(array1[j++]+", ");
            else {
                System.out.print(array1[j++]+", ");
                i++;
            }
        }
        while(i < a)
            System.out.print(array[i++]+" ");
        while(j < b)
            System.out.print(array1 [j++]+" ");
        return ;

    }
}
