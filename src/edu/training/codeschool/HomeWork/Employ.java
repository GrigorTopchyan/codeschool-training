package edu.training.codeschool.HomeWork;

import edu.training.codeschool.HomeWork.Person;

public class Employ extends Person {
    public String office;
    public double salary;

    public Employ(String name, String adress, String office, double salary) {
        super(name, adress);
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

    @Override
    public String toString() {
        return "Employ{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
