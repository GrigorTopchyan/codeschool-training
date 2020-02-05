package edu.training.codeschool.HomeWork4.Constructors;

import java.util.Scanner;

public class TestEmployee {



    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("employee created");
        employee.setId(135);
        employee.setFirstName("Josh");
        employee.setLastName("Smith");
        employee.setSalary(12000);

        employee.toString();

        System.out.println(" ");

        employee.toString1();
    }


}
