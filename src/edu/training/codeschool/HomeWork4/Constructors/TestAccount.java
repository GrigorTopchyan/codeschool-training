package edu.training.codeschool.HomeWork4.Constructors;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("account created");
        account.setId(243);
        account.setName("James");
        account.setBalance(1000);

        account.toString();

        account.debit();

        Account account1 = new Account();
        System.out.println("account1 created");
        account1.setId(354);
        account1.setName("Bob");
        account1.setBalance(1200);

        account1. toString();

        account1.credit();

        account.transfer1();
        account1.transfer2();
        System.out.println(" ");
        account.toString();
        System.out.println(" ");
        account1.toString();


    }
}
