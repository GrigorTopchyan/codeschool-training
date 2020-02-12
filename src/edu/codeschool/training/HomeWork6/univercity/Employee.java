package edu.codeschool.training.HomeWork6.univercity;

public class Employee implements Person {
    String departmentName;

    public Employee(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void getDescription() {
        System.out.println("Employee department is " + getDepartmentName());
    }
}
