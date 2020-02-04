package homework4;

public class ClosestNumber {
    /**
     * 1.0 Գրել ծրագիր, որը կգտնի մուտքագրված թվին հաջորդող ամենամոտիկ պարզ թիվը․(Գրել մեթոդի օգնությամբ,
     * այսինքն գրել մեթոդ, որը կստանա ինչ որ թիվ և կվերադարձնի այդ թվին հաջորդող ամենամոտիկ պարզ թիվը)
     */
    public static void main(String[] args) {
        ClosestNumber task1 = new ClosestNumber();
//
        System.out.println(task1.closestNumber(120));
    }

    public boolean isPrime(int num) {
        boolean isPrime;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }

        }


        return isPrime;
    }


    public int closestNumber(int number) {
        int closestNumber1 = number - 2;
        int closestNumber2 = number - 3;

        for (int i = 1; i <= 10; i++) {
            closestNumber1 = number - i;
            closestNumber2 = number - i + 1;
        }


        if (closestNumber1 > closestNumber2 && isPrime(closestNumber1)) {
            return closestNumber1;
        } else {
            return closestNumber2;
        }


    }
}
