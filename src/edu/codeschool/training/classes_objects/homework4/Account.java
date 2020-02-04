package edu.codeschool.training.classes_objects.homework4;

public class Account {

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

    //պահանջում ասվումա սարքել միայն getter մեթոդներ
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }


    //Չի պահանջվում սարքել increase մեթոդ,
    //պիտի սարքես debit(double amount) որը պիտի ավելացնի քո օբյեկտի բալանս դաշտը

    public double increase (){
        double amaunt = 0;
        amaunt = amaunt + 1;
        return amaunt;
    }

    //Չի պահանջվում սարքել subtract մեթոդ,
    //պիտի սարքես credit(double amount) որը պիտի ավելացնի քո օբյեկտի բալանս դաշտը
    //Պիտի վալիդացիա անես այսինքն ստւգես կարաս amounti չափով հանես թէ չէ
    public double subtract (){
        double amaunt = 0;
        amaunt = amaunt - 1;
        return amaunt;
    }

    //Էս ինչ մեթոդա անիմաստ բանա գրած
    public int account(int amount){
        return amount;
    }

    //մեթոդի անունը պիտի լինի transferToOtherAccount, որը պիտի տվյալ account ից amount քանակով տրանսֆեռ անի otherAccount ի բալանսին
    //պիտի վալիդացիաներ անես արդյոք
    public int otherAccount(int amount){
        return amount;
    }

    //Միքիչ սիրունացրու
    public String toString(){
        return id+name+balance;
    }


}
