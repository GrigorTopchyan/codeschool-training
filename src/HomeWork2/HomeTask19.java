package HomeWork2;

public class HomeTask19 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newarray1 = {7, 8, 9, 0};
        int[] newarray2 = {7, 8, 3, 5};

        //Ստեղ երեք արայ պետք չի
        //պիտի ստուգես թե տրված երկու արայները հավասար են թե չէ
        //արայները կոչվում են հավասար եթե իրանց սաղ էլեմենտները նույն են
        //սենց սխալա փորձի ուղղես ցիկլով ով պիտի գրես
        if (array.length == newarray1.length) {
            System.out.println("{1,2,3,4,5,6} - {7,8,9,0} equal");
        } else {
            System.out.println(" {1,2,3,4,5,6} - {7,8,9,0} not equal");
        }
        if (newarray2.length == newarray1.length) {
            System.out.println("{7,8,3,5} - {7,8,9,0} equal");
        } else {
            System.out.println(" {7,8,3,5} - {7,8,9,0} not equal");
        }
    }
}
