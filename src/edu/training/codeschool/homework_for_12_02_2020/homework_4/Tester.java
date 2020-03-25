package edu.training.codeschool.homework_for_12_02_2020.homework_4;

public class Tester extends Employee{

    public Tester(String name, double salary, int age) {
        super(name, salary, age);
    }

    public void doWork(){
        System.out.println("i am testing right now!!!");
    }

    public String test(){
        return("Something went wrong");
    }
}
