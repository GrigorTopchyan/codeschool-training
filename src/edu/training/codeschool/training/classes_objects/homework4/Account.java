package edu.training.codeschool.training.classes_objects.homework4;

public class Account {
    /**
     * 5.1 Class has following state and behaviour:
     * Three private fields id of type String, name of type String and balance of type double.
     * Two overloaded constructors - constructor with id and name parameter, constructor with id, name and balance parameters.
     * Create only getter methods for all fields.
     * Create credit(double amount) method which increase the balance by given amount and returns current balance.
     * Create debit(double amount) method which subtract balance by given amount and returns current balance.
     * Create transferTo(Account otherAccount, int amount) which transfers the given amount form one the acount to otherAccount.
     * Create toString() method which returns string representation of the account object in this format: Account[id=?, name=?, balance=?]
     */
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;

    }

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

    public double debit(double amount) {
        if (amount < 0) {
            System.out.println("Enter positive amount");
            return 0;
        }else {
            this.balance+=  amount;
            return this.balance;
        }
    }

    public double credit(double amount) {
        if (amount > getBalance()) {
            System.out.println("Sorry you can't withdraw more than your balance");

        } else if (amount < 0) {
            System.out.println("Enter positive amount");
            //խի  this.balance=0;
            this.balance=0;
        }else {
            this.balance-=  amount;
            return this.balance;
        }

        return 0;

    }

    public void transferTo(Account otherAccount, double amount) {

        System.out.println("You send " + otherAccount.getName() + " " + amount + "$");
        System.out.println("You balance = " + credit(amount) + "$");
    }

    @Override
    public String toString() {

        return "[" + "id = " + id + ", name = " + name + ", balance = " + balance + "$ ]";
    }
}
