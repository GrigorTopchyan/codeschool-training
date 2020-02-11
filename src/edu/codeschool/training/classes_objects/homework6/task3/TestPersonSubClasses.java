package edu.codeschool.training.classes_objects.homework6.task3;

public class TestPersonSubClasses {
    public static void main(String[] args) {

        Student student = new Student("Poghos","Armenia,Yerevan","YPH",2);
        Employee employee = new Employee("Poghos","Armenia,Yerevan","Microsoft office",500000);
        System.out.println(employee.toString());
        System.out.println(student.toString());


    }
}
