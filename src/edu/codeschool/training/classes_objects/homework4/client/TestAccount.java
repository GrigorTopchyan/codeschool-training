package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account ac1 = new Account("42", "john", 550);
        Account ac2 = new Account("55", "Jack", 700);
        ac1.credit(200);
        ac2.debit(100);
        ac1.transferTo(ac1, 500);
        System.out.println(ac1);
        System.out.println(ac2);

    }
}
