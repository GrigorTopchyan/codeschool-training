package edu.training.codeschool.homework_for_09_02_2020.homework_3;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        Student student = new Student("John Deacon", "Jabrail", "Harvard", 150);
        Employee employee = new Employee("Brian May", "Hadrut", "Oxford", 220);
        System.out.println(student);

        System.out.println(employee);
    }
}
