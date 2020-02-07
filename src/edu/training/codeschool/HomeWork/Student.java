package edu.training.codeschool.HomeWork;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private int birthDate;
    private static int count;

    public Student(String name, int age, int birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }

    public static int getCount() {
        return count;
    }
}
