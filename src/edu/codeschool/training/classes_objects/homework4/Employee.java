package edu.codeschool.training.classes_objects.homework4;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
      this.id=id;
      this.firstName=firstName;
      this.lastName=lastName;
      this.salary=salary;
    }
    public int getId() {
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(){
        this.firstName=firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(){
        this.lastName=lastName;
    }
      public double getSalary(){
          return salary;
  }
    public void setSalary(){
        this.salary=salary;
    }


    public double getAnnualSalary(){

        return salary*12;
    }
    public double raiseSalary(double byPercent)
    {
        return salary = salary + ((salary * byPercent) / 100);
    }
    public  String toString(){
        return "[" + "id = " + id + ", Firstname = " + firstName + ", LastName = " + lastName +", Salary"+salary+ " ]";
    }
    }

