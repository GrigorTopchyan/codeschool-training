package edu.training.codeschool.homework_for_09_02_2020.homework_3;

public class Employee extends Person {
    private String office;
    private double salary;

    public Employee(String name, String address, String office, double salary) {
        super(name, address);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getSuperString(){
        return super.toString();
    }
    @Override
    public String toString() {
        return "employee " + getSuperString() +
                " office='" + office + '\'' +
                ", salary=" + salary +
                '}';
    }
}
