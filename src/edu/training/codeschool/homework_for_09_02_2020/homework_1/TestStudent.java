package edu.training.codeschool.homework_for_09_02_2020.homework_1;

import java.time.LocalDate;

public class TestStudent {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1999, 10, 1);
        LocalDate birthDate1 = LocalDate.of(1989, 11, 12);
        Student student = new Student("Susan", 21, birthDate);
        Student student1 = new Student("Jane", 24, birthDate1);
        System.out.println(student);
        System.out.println(Student.quantityOfObjects());
    }
}