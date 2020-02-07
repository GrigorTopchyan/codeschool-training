/*
 1.2 Create class TestStudent.
 In main method create three objects of type Student.
 Print how many objects were created of type Student.
*/
package edu.codeschool.training.classes_objects.homework5;

import java.util.Calendar;

public class TestStudent {

    public static void main(String[] args) {


        Student1 student1= new Student1("Bob",20, Calendar.getInstance());
        Student1 student2 = new Student1("John",22,Calendar.getInstance());
        Student1 student3 = new Student1("Nik",29,Calendar.getInstance());



       student1.printNumberOObjects();
       student2.printNumberOObjects();
       student3.printNumberOObjects();

    }
}
