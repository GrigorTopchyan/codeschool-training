package edu.training.codeschool.homework_for_09_02_2020.homework_1;

import java.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private LocalDate birthDate;
    private static int counter = 0;

    public Student(String name, int age, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        counter++;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
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

    public static String quantityOfObjects() {
        return "Student{Objects quality is equal to : }"+counter;
    }
}
