package edu.codeschool.training.HomeWork6.Employee;

public class Programmer extends Employee {
    public Programmer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void doWork() {
        System.out.println("inside Programmer");
    }

    public void createSoftware(){};
}
