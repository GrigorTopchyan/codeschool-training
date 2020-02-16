package edu.codeschool.training.HomeWork6.Employee;

public class Designer extends Employee {
    public Designer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void doWork() {
        System.out.println("inside Designer");
    }

    public void design(){};

    @Override
    public String toString() {
        return "Designer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                "} ";
    }
}
