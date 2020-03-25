package edu.training.codeschool.homework_for_12_02_2020.homework_4;

public class Designer extends Employee {
    public Designer(String name, double salary, int age) {
        super(name, salary, age);
    }
    public void doWork(){
        System.out.println("i am designing now");
    }

    public String design(){
        return "Good design";
    }
}
