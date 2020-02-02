package edu.codeschool.training.classes_objects.homework4;

//
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public  Employee(int id,String firstName,String lastName,double salary){
        this.id = id;
    }


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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary (){
        double annualSalary = 0;
        annualSalary = (annualSalary + salary) * 12;
        return annualSalary;
    }
    public double raiseSalary(int percent){
        percent = percent/100;
        double raiseSalary = salary + (salary * percent);
        return raiseSalary;
    }


    public String toString() {
        return "Employee{" + "id=" + id + ", firstName='" + firstName  + ", lastName='" + lastName
                + ", salary=" + salary + '}';
    }

}


