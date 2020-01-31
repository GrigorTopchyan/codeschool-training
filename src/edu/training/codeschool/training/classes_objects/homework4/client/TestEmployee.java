package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.Employee;

public class TestEmployee {
    /**
     *  Inside main method create one Employee object. Print annual salary of the employee.
     *                        Raise the salry by 10 percent.
     *                        Print the employee.
     */
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Poghos", "Poghosyan",3000) ;
        System.out.println(employee.toString());
        System.out.println("Annual salary = "+employee.getAnnualSalary());

       employee.raiseSalary(10);


    }
}
