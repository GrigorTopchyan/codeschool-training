package edu.training.codeschool.oop;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("acc1","user1",2344);
        Account other = new Account("acc2","user2",2300);
        account.debit(100);
        other.credit(200);
        account.transferTo(other,500);
        System.out.println(account);
        System.out.println(other);
    }
}
