package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.Account;

public class TestAccount {
    /**
     *  Inside main method create two account object of type Account.
     *                        Debit balance of first account by 100.
     *                        Credit balance of second account by 200.
     *                        Transfer 500 from first account to second account.
     *                        Print two acconts.
     */
    public static void main(String[] args) {
        Account account1 = new Account("1", "Alex",5000);
        Account account2 = new Account("2", "Ann",15000);
        System.out.println("Debit balance of "+account1.getName()+" "+account1.debit(2000)+"$");
        System.out.println("Credit balance of "+account2.getName()+" "+account2.credit(2000)+"$");
        account1.transferTo(account2,500);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

    }
}
