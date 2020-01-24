package homework1;


public class HomeTask13 {
    public static void main(String[] args) {

        int x = 0;
        System.out.print("number");
        if (x == 0) {
            System.out.println(" zero");
        } else if (x > 0) {
            System.out.println(" positive");
        } else if (x < 0) {
            System.out.println(" negative");
        }else if (x<1){
            System.out.println(" small");
        }else if(x>1000000){
            System.out.println(" large");
        }

    }
}
