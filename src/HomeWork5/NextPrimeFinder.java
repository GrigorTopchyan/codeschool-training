package HomeWork5;


public class NextPrimeFinder {

    public static int findNextPrime(int num) {
        int j = 1;
        while (true) {
            if (isPrime(num + j)) {
                break;
            }j++;
        }  return num +j;

    }



       public static boolean isPrime(int number1){
        boolean b=true;
      for (int i = 2; i <number1/2 ; i++) {
          if (number1%i==0){
              return false;
          }
      }
      return b;

  }
}




