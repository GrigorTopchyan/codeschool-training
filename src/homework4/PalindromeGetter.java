package homework4;

//կլասսի անունը ավելի ճիշտ կլնի PalindromeChecker դնել
public class PalindromeGetter {
    /**
     * 4.0 Գրել ծրագիր, որը կպարզի կոնսոլից մուտքագրված թիվը պոլինդրոմ է թէ ոչ
     * Թիվը կոչվում է պոլինդրոմ, եթե սկզբից և վերջից կարդացվում են նույն կերպ
     * Օրինակ։ 12321, 45654, 787
     */

    //լավ կլինի main մեթոդը առանձնացնես առանձին կլասսի մեջ գրես օրինակ PolindromTest
    public static void main(String[] args) {

        System.out.println(PalindromeGetter.GetPalindrome(13331));

    }

    //մեթոդի անունը փոքրատառով պիտի սկսվի
    static boolean GetPalindrome(int num) {
        int next = 0;
        int pal2 = num;

        while (pal2 != 0) {
            next = (next * 10) + (pal2 % 10);
            pal2 /= 10;
            //պետք չի ամեն անգամ տպես
            System.out.println(next);
        }

        //կարաս մի տողով գրես return num == next;
        if (num == next) {
            return true;
        } else {
            return false;
        }
    }
}
