/*
 3.1 Create class TestPersonSubClasses inside main method create objects of type Student and Employee
 Print this objects on console
 */

package edu.codeschool.training.classes_objects.homework5;

public class TestPersonSubClasses {
    public static void main(String[] args) {

        Student2 student2 = new Student2("","","Brunel University",4500);
        Employee employee = new Employee("","","Shop Home Office",3000);



        System.out.println(employee.toString());
        System.out.println(student2.toString());

    }
}
