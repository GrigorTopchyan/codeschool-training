package HomeWork8.HomeTask1;

public class Boolean {
    boolean isNegativeOrPositive(double number){
        if(number>0)return true;
        return false;
    }
    boolean isPrime(double number){
        for (int i = 2; i <number/2 ; i++) {
            if(number%i!=0){
                return true;
            }

        } return false;
    }
    boolean isEvan(int number){
       if(number%2==0){return true;}
       return false;
    }
}
