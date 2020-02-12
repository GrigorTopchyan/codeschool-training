package edu.training.codeschool.HomeWork4.Constructors;

public class Account {
    private int id;
    private String name;
    private double balance;

    //constructoer sarqi

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
}

    //credit methody piti stana parameter te inchqan ptit avelacni voch te fixsac 200
    public double credit() {
        return balance=balance + 200;
    }

    //nuyn el stex
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

    //mihat transfer method piti liner
    //transfer methody piti ynduni vorpes parameter mihat urish account u qnaaky te inchqan piti transfer ani
    //u et account balancy piti mecacno this i balancy poqracni
    //piti validacianer anes ardjoq kara transfer ani etqan gumar aysinqn etqan pox uni te che
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