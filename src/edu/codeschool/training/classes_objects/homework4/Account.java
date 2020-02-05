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
            //Ստեղ էլ վերադարձրու current բալանսը
            return 0;
        }else {
            //ստեղ կարաս balance դաշտին դիմես պետք չի մեթոդով դիմես կարաս գրես  this.balance -= amount;
            //credit ը պիտի նվազեցնի ոչ թե գումարի
            this.balance=getBalance() + amount;
            return this.balance;
        }
    }

    public double debit(double amount) {
        //Էս if  դատարկա անիմաստա
        if (amount > getBalance()) {
        } else if (amount < 0) {
            System.out.println("positive amount");
            //խի ես բալանսը զրոյացնում էս դեպքում
            this.balance=0;
        }else {
            //ստեղ կարաս balance դաշտին դիմես պետք չի մեթոդով դիմես կարաս գրես  this.balance += amount;
            this.balance=getBalance() + amount;
            return this.balance;
        }
        return 0;
    }

    //
    public void transferTo(Account otherAccount, double amount) {

        //ստեղ պետք չի տպես ինչ որ բան
        //էս մեթոդի իմաստը էնա որ տվյալ account ից amount քանակով փոխանցի otherAccount ին
        System.out.println("You send " + otherAccount.getName() + " " + amount);
        //Ստեղ debit մեթոդն ես կանչել, որը գումարումա current օբյեկտի բալանսը պիտի հանես ոչ թե գումարես
        //otherAccount ի բալանսն էլ պիտի գումարվի փոխանցվելա չէ իրա հաշվին
        System.out.println("You balance = " + debit(amount) );
    }
    public String toString() {
        return "[" + "id = " + id + ", name = " + name + ", balance = " + balance + " ]";
    }




}


