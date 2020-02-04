package HomeWork2;

public class HomeTask19 {
    public static void main(String[] args) {
        int[] newarray1 = {7, 8, 3, 5};
        int[] newarray2 = {7, 8, 3, 5};
        boolean b;
        for (int i = 0; i < newarray1.length; i++) {
            if (newarray1[i] == newarray2[i]) {
                b=true;
            }}

            //Ստեղ երեք արայ պետք չի
            //պիտի ստուգես թե տրված երկու արայները հավասար են թե չէ
            //արայները կոչվում են հավասար եթե իրանց սաղ էլեմենտները նույն են
            //սենց սխալա փորձի ուղղես ցիկլով ով պիտի գրես
            if (b=true) {
            System.out.println("equality is true");
        } else {
            System.out.println("equality is false");
        }
    }
}