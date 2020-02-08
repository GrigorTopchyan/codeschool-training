package edu.codeschool.training.abstracts_extendes.homework5.client;

import edu.codeschool.training.abstracts_extendes.homework5.Student;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student first = new Student("Jack",23,new Date());
        Student second = new Student("John",21,new Date());
        System.out.println(Student.calculateQuantityStudents);
    }
}
