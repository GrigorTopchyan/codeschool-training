package edu.codeschool.training.classes_objects.homework4;

public class Account {
    private String id;
    private String name;
    private double balance;


    public Account() {
    }

    public Account(String id, String name) {
    }

    ;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    ;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double balanceIncrease(double amount) {
        this.balance = balance + amount;
        return this.balance;
    }

    public double debit(double amount) {
        this.balance = balance - amount;
        return this.balance;
    }

    public double credit(double amount) {
        this.balance = balance + amount;
        return this.balance;
    }


    public void transferTo(Account other, int amount) {
        if (amount > balance) {
            System.out.println("Your balance is negative");


        } else {
            other.balance += amount;
            debit(amount);
            System.out.println("Your transfer " + amount);
            System.out.println("Your balance is " + balance);
            System.out.println("Her balance is " + other.balance);
        }
    }


    public String toString() {
        return "Account{" + "id = " + id + ", name = " + name + ", balance = " + balance + '}';
    }
}

