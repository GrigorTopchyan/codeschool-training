package edu.training.codeschool.homework_for_12_02_2020.homework_4;

public class Company {
    Employee[] employees = new Employee[Employee.counter];
    public Employee[] hireEmployee(Employee employee){
        Employee[] updatedArr = new Employee[Employee.counter + 1];
        for (int i = 0; i < Employee.counter ; i++) {
            updatedArr[i] = employees[i];
            updatedArr[i] = employee;
        }
        return updatedArr;
    }

}
