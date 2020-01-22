package com.javalesson.controlstatement;

public class WhileDo {
    public static void main(String[] args) {
        int finalBalance = 250000;
        double balance = 0;
        int paymant = 15000;
        int years = 0;
        double interest = 0.1;

        do {
            balance += paymant;
            balance = balance + balance * interest;
            ++years;
            System.out.println("Year" + years + "-" + balance);
        }

        while (balance < finalBalance);

    }


}
