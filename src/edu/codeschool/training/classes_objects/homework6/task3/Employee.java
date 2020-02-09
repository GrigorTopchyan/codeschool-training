package edu.codeschool.training.classes_objects.homework6.task3;

public class Employee extends Person {
    public String office;
    public double salary;

    public Employee(String name, String adress, String office, double salary) {
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
                ", address='" + address + '\'' +
                '}';
    }
}
