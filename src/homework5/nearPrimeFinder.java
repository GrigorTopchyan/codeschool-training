package homework5;

//կլասի անունը պիտի մեծատառ լինի
public class nearPrimeFinder {

    public static int find(int inputNumber) {
        int i=1;
        while (true) {
            if (isPrime(inputNumber + i)) {
                return inputNumber+i;
            }
            i++;
        }
    }
    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
