package edu.training.codeschool.HomeWork4.Constructors;

public class Employee {
    private int id;
    private String FirstName;
    private String LastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double getRaiseSalary() {
        return salary += ((salary * 10) / 100);
    }

    //toString i mej petq chi tpel inch vor ban
    //piti veradarcni objecti string nerkayacumy, du null es veradrcrel
    public String toString() {
        System.out.println("id=" + getId());
        System.out.println("FirstName " + getFirstName());
        System.out.println("LastName " + getLastName());
        System.out.println("Salary=" + getSalary());
        System.out.println("AnnualSalary=" + getAnnualSalary());
        return null;
    }

    //xi es erku hat toString sarqel
    public String toString1() {
        System.out.println("id=" + getId());
        System.out.println("FirstName " + getFirstName());
        System.out.println("LastName " + getLastName());
        System.out.println("Salary=" + getRaiseSalary());
        System.out.println("AnnualSalary=" + getAnnualSalary());
        return null;
    }
}