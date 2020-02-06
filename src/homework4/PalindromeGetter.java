package homework4;

public class PalindromeGetter {
    /**
     * 4.0 Գրել ծրագիր, որը կպարզի կոնսոլից մուտքագրված թիվը պոլինդրոմ է թէ ոչ
     * Թիվը կոչվում է պոլինդրոմ, եթե սկզբից և վերջից կարդացվում են նույն կերպ
     * Օրինակ։ 12321, 45654, 787
     */
    public static void main(String[] args) {

        System.out.println(PalindromeGetter.GetPalindrome(13331));

    }

    static boolean GetPalindrome(int num) {
        int next = 0;
        int pal2 = num;

        while (pal2 != 0) {
            next = (next * 10) + (pal2 % 10);
            pal2 /= 10;
            System.out.println(next);
        }

        if (num == next) {
            return true;
        } else {
            return false;
        }
    }
}
