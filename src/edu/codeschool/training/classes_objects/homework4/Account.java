package edu.codeschool.training.classes_objects.homework4;

public class Account {
    private String id;
    private String name;
    private double balance;



    public Account(){}
    public Account(String id,String name){};
    public Account(String id,String name,double balance){};

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public double balanceIncrease(double amount){
        amount = balance + amount;
        return amount;
    }
    public double balanceSubtract(double amount){
        amount = balance - amount;
        return amount;
    }



    public String toString() {
        return "Account{" + "id = " + id +  ", name = " + name + ", balance = " + balance + '}';
    }
}

