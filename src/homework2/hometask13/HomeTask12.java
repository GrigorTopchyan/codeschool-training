package homework2.hometask13;

public class HomeTask12 {
    /**
     * 13. Given an array of chars array = {'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'}.
     * Write a Java program to count the number of uppercase letters from array of chars.
     */
    public static void main(String[] args) {
        char[] chars = {'a', 'A', 'N', '?', '.', 'P', 'v', 'T', 'f', '0', 'i', '1', 'L', 'k', 'm', 'H'};
        int count = 0;
        for (int i = 0; i <=chars.length-1 ; i++) {
            if (chars[i]>=65&&chars[i]<=90){
                count++;
            }
        }
        System.out.println("count the number of uppercase letters from array of chars = " +count);
    }


}
