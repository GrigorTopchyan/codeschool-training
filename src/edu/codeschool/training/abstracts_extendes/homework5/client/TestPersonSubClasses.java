package edu.codeschool.training.abstracts_extendes.homework5.client;

import edu.codeschool.training.abstracts_extendes.homework5.Employee;
import edu.codeschool.training.abstracts_extendes.homework5.Student;
import edu.codeschool.training.abstracts_extendes.homework5.StudentPerson;

import java.util.Date;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        StudentPerson first = new StudentPerson("John","USA","HAAH",11.7);
        Employee std = new Employee("Jony","Italy,Milan","UAA",13.7);
        System.out.println(first);
        System.out.println(std);
    }
}
