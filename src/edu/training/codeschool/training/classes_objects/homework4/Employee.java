package edu.training.codeschool.training.classes_objects.homework4;

public class Employee {
    /**
     * 3.1 The class should have following state and behaviour:
     * Four private fields:
     * id of type int
     * firstName of type String
     * lastName of type String
     * salary of type double
     * One constructor with id,firstName, lastName, salary parameters
     * getter and setter methods(getId(), setId(int id) such methods for all fields)
     * getAnnualSalary() which returns the annual salary of the employee.
     * raiseSalary(int percent) which rises the salary by the given percent
     * toString() method which returns string representation of the Employee with the format Employee [id=?, Name = firstName lastName, salry=?]
     */
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private static final double MONTH_OF_YEAR = 12;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public double getAnnualSalary() {

        return MONTH_OF_YEAR * getSalary();
    }

    public void raiseSalary(int percent) {

        double getPercent = getAnnualSalary()/100 * percent;
        double salaryAfterRaise = getPercent + getAnnualSalary();
        System.out.println("Annual salary after a raise on "+percent+ " = "+salaryAfterRaise );


    }


    @Override
    public String toString() {
        return "[" + "id = " + getId() + ", Name = " + getFirstName() + ", Last name = " + getLastName() + ", salary = " + getSalary() + " ]";
    }
}
