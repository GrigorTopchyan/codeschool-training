package edu.training.codeschool.HomeWork4.classes_objects;
//othery balance -ը չի գտնում
//

public class Account {
    private String id ="asdfgh" ;
    private String name ="a" ;
    private double balance =100 ;

    public Account(String id, String name) {
        this.id=id; this.name=name;
    }
   public Account(String id ,String name,double balance){
       this.id=id; this.name=name;
       this.balance=balance;

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

    public double credit(double amount){
        balance=balance+amount;
        return balance;

    }
    public double  debit(double amount){
      balance=balance-amount;
      return amount;
    }
    public void transferTo(Account otherAccount, int amount) {
        if (amount>balance){
            System.out.println("min balance is 0");
        }  else {debit(amount);otherAccount.balance=otherAccount.balance+amount;
            System.out.println("your transfer  is" +amount);
            System.out.println("your new balance is "+balance );
            System.out.println("other Account balance is " +otherAccount.balance );
        }


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





