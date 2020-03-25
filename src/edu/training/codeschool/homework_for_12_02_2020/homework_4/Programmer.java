package edu.training.codeschool.homework_for_12_02_2020.homework_4;

public class Programmer extends Employee {
    public Programmer(String name, double salary, int age) {
        super(name, salary, age);
    }
    public void doWork(){
        System.out.println("i am programming right now!!!");
    }
    public String createSoftware(){
        return "Software is a good";
    }
}
