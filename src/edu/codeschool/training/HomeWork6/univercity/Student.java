package edu.codeschool.training.HomeWork6.univercity;

import edu.codeschool.training.HomeWork6.univercity.Person;

public class Student implements Person {
    String name;
    String email;
    String grade;

    public Student(String name, String email, String grade) {
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public void getDescription() {
        System.out.println(getGrade() + " grade student");

    }
}
