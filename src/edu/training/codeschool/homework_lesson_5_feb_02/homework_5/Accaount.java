package edu.training.codeschool.homework_lesson_5_feb_02.homework_5;

public class Accaount {
    private String id;
    private String name;
    private double balance;

    public Accaount(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Accaount(String id, String name, double balance) {
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
        this.balance = getBalance() + amount;
        return this.balance;
    }

    public double debit(double amount) {
        this.balance = getBalance() - amount;
        return this.balance;
    }

    public void transferTo(Accaount otherAccaount, int amount) {
        otherAccaount.balance = otherAccaount.getBalance() + amount;
        this.balance = this.getBalance()-amount;

    }

    @Override
    public String toString() {
        return "Accaount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
