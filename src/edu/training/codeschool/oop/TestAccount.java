package edu.training.codeschool.oop;

public class TestAccount {
    public static void main(String[] args) {

        Account account = new Account("acc1","user1",2344);
        Account account1 = new Account("acc1","user2",2344);
        account.setBalance(2000);
        System.out.println(account.getBalance());
        Account.chargeFee();

    }
}
