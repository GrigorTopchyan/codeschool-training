package edu.codeschool.training.classes_objects.homework4;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("1", "Poxos",3000);
        Account a2 = new Account("2", "Mery",10000);
        System.out.println("balance: "+a1.getName()+" "+a1.debit(2000));
        System.out.println("balance: "+a2.getName()+" "+a2.credit(2000));
        a1.transferTo(a2,500);

        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}
