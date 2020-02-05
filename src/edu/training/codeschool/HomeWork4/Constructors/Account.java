package edu.training.codeschool.HomeWork4.Constructors;

public class Account {
    private int id;
    private String name;
    private double balance;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
}

    public double credit() {
        return balance=balance + 200;
    }

    public double debit() {
        return balance=balance - 100;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double transfer1() {
        return balance=balance-500;
    }
    public  double transfer2() {
        return balance=balance+500;
    }

    public String toString() {
        System.out.println("[id=" + getId() + ",name=" + getName() + ",balance=" + getBalance() + "]");
        return null;
    }
}