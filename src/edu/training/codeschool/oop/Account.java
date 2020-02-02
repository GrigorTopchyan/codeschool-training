package edu.training.codeschool.oop;

/**
 * Create class with name Account inside edu.codeschool.training.classes_objects.homework4 package.
 *                   5.1 Class has following state and behaviour:
 *                       Three private fields id of type String, name of type String and balance of type double.
 *                       Two overloaded constructors - constructor with id and name parameter, constructor with id, name and balance parameters.
 *                       Create only getter methods for all fields.
 *                       Create credit(double amount) method which increase the balance by given amount and returns current balance.
 *                       Create debit(double amount) method which subtract balance by given amount and returns current balance.
 *                       Create transferTo(Account otherAccount, int amount) which transfers the given amount form one the acount to otherAccount.
 *                       Create toString() method which returns string representation of the account object in this format: Account[id=?, name=?, balance=?]
 *                    5.2 Create class with name TestAccount inside edu.codeschool.training.classes_objects.homework4.client package.
 *                        Inside main method create two account object of type Account.
 *                        Debit balance of first account by 100.
 *                        Credit balance of second account by 200.
 *                        Transfer 500 from first account to second account.
 *                        Print two acconts.
 */
public class Account {
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

    public Account() {
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

    public double debit(double amount){
        this.balance += amount;
        return this.balance;
    }
    public double credit(double amount){
        this.balance -= amount;
        return this.balance;
    }

    public boolean transferTo(Account other,double amount){
        this.balance -= amount;
        //....
        other.balance+= amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }


}
