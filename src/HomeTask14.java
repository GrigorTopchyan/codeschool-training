import java.util.Scanner;

public class HomeTask14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        char d = (char) (c + 32);
        char a = (char) (c-32);
        if (c > 64 && c < 91) {
            System.out.println(d);}
        if (c >96 && c <123){
            System.out.println(a);



    }}}

