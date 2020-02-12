package edu.codeschool.training.classes_objects.homework6.task1;

import java.time.LocalDate;

//klassi anuny piti mecatar lini
public class testStudent {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1999, 1, 1);
        LocalDate birthDate1 = LocalDate.of(2002, 10, 7);
        Student student = new Student("Poghos", 21, birthDate);
        Student student1 = new Student("Mery", 16, birthDate1);
        System.out.println(student);
        System.out.println(student1);

        //stex piti tpes te qani objecata stexcvel

    }
}
