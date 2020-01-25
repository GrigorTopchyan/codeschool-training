package homework1;

public class HomeTask5 {
    public static void main(String[] args) {
        String symbol = "   *";
        String space = " ";
        String symb = "*";

        for (int x = 0; x < 1; x++){
            System.out.println(symbol);
            symb += symb;

            for (int y = 0; y < 1; y++){
                String symb1 = "*";
                symb1 = symb + symb1;
                System.out.println(space + space + symb1);
                symb1 += symb1;
                System.out.println(space + symb1);
                System.out.println(symb + symb1);
            }



        }


    }
}
