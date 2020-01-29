package homework2.hometask18;

public class HomeTask18 {
    /**
     *  18.  Write a Java program to compute a count of true and false elements in boolean array
     *                      ex. {true, false, false, false, true, false} -> 2 true, 4 false
     */
    public static void main(String[] args) {
boolean[] arr = {true, false, false, false, true, false,true, false, true, false, true, false};
int countOfTrue=0;
int countOfFalse=0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            if (arr[i]==true){
                countOfTrue++;
            }else  {
                countOfFalse++;
            }
        }
        System.out.println(countOfTrue+" true");
        System.out.println(countOfFalse+" false");
    }
}
