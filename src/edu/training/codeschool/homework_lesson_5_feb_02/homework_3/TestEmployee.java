package edu.training.codeschool.homework_lesson_5_feb_02.homework_3;

public class TestEmployee {
    public static void main(String[] args) {
    Employee badEmployee = new Employee(1,"George", "Bush",15000.0);
        System.out.println(badEmployee.raiseSalary(14));
        badEmployee.setFirstName("Bill");
        System.out.println(badEmployee.toString());
    }
}
