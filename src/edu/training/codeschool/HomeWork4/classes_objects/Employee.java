package edu.training.codeschool.HomeWork4.classes_objects;

public class Employee {
    private int id=123456;
    private String firstName=("www");
    private String lastName=("aaa") ;
    public int salary=100;


     public Employee(int id, String firstName, String lastName, int salary){
         this.id=id; this.firstName=firstName;this.lastName=lastName;
         this.salary=salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary(){
        double x=0;
        x = 12 * salary;
        return x ;
    } int percent;

    public double Percent(double percent) {

        percent=percent*salary/100;
            return percent;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}


