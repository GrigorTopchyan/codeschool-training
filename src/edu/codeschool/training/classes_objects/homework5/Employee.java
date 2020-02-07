/*

Create class Employee which should have all properties of Person class plus Employee has office of type String, salary of type double
  Create constructor with name, address, office and salary parameters
  Create getter and setter methods for all fields
  Override toString() method which returns all information for Employee object

 */
package edu.codeschool.training.classes_objects.homework5;

public class Employee extends Person {


    String office;
    double salary;


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


    public Employee(String name, String address, String office, double salary) {
        super(name, address);
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name, String address) {
        super(name, address);
    }



    @Override
    public String toString() {
        return "Employee {" +
                "office = '" + office + '\'' +
                ", salary = " + salary +
                ", name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }

}
