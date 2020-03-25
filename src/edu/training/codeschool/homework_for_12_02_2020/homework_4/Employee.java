package edu.training.codeschool.homework_for_12_02_2020.homework_4;

public abstract class Employee {
    private String name;
    private double  salary;
    private int age;
    public static int counter = 0;
public Employee(){}
    Employee (String name, double salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
        counter ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected double getAnnualSalary(){
        return 12*salary;
    }

    public abstract void doWork();
}
