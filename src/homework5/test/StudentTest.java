package homework5.test;


import homework5.student.Student;

import java.time.LocalDate;

public class StudentTest {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1988, 02, 23);
        LocalDate localDate1 = LocalDate.of(1999, 12, 16);
        LocalDate localDate2 = LocalDate.of(1996, 04, 03);
        Student student = new Student("A", localDate);
        Student student1 = new Student("B", localDate1);
        Student student2 = new Student("C", localDate2);
        System.out.println(Student.countOfObject());



    }


}