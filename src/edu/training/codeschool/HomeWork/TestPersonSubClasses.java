package edu.training.codeschool.HomeWork;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        Studen1 studen1=new Studen1("Hayk", "Yerevan", "Petakan",25000);
        Employ employ=new Employ("Gegham","Vanadzor","Grand Holding",4500000);
        System.out.println(employ.toString());
        System.out.println(studen1.toString());
    }
}
