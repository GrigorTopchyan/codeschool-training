package edu.codeschool.training.classes_objects.homework4;

public class Employee {



    private String firstName;
    private int id;
    private String lastName;
    private double salary;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }


    public double getAnnualSalary(){
        return salary * 24;
    }

    public double raiseSalary(){
        return salary + 300;
    }

   public String toString(){
        return  firstName  + lastName + id + salary;
    }



}
