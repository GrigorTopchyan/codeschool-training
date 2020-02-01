package edu.codeschool.training.classes_objects.homework4;

public class Account {

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    private String id;
    private String name;
    private double balance;


    public Account(String id,String name){
        this.id= id;
        this.name = name;
    }

    public Account(double balance,String id,String name){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public double increase (){
        double amaunt = 0;
        amaunt = amaunt + 1;
        return amaunt;
    }

    public double subtract (){
        double amaunt = 0;
        amaunt = amaunt - 1;
        return amaunt;
    }
    public int account(int amount){
        return amount;
    }

    public int otherAccount(int amount){
        return amount;
    }

    public String toString(){
        return id+name+balance;
    }




}
