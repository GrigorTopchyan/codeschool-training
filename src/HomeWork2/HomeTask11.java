package HomeWork2;

public class HomeTask11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] reverse = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            //Երկրորդ for ը պետք չի սենց սխալա աշխատում
            //կարաս մի հատ էլ փոփոխական պահես reverse արայի համար
            //Փորձի ուղղես
            for (int j = 0; j < 1; j++) {
                reverse[j] = (array[i]);
                System.out.println(reverse[j]);
            }


        }
    }
}

