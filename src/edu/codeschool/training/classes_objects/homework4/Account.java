package edu.codeschool.training.classes_objects.homework4;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public double credit(double amount) {
        if (amount < 0) {
            System.out.println("positive amount");
            return 0;
        }else {
            this.balance=getBalance() + amount;
            return this.balance;
        }
    }
    public double debit(double amount) {
        if (amount > getBalance()) {
        } else if (amount < 0) {
            System.out.println("positive amount");
            this.balance=0;
        }else {
            this.balance=getBalance() + amount;
            return this.balance;
        }
        return 0;
    }
    public void transferTo(Account otherAccount, double amount) {

        System.out.println("You send " + otherAccount.getName() + " " + amount);
        System.out.println("You balance = " + debit(amount) );
    }
    public String toString() {
        return "[" + "id = " + id + ", name = " + name + ", balance = " + balance + " ]";
    }




}


