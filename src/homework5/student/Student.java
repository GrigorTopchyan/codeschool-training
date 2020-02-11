package homework5.student;

import javafx.scene.input.DataFormat;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    /**
     * 1.1 Create class with name Student. Student should have following state and behaviour:
     * Three private fields name of type String, age of type int birthDate of type java.util.Date
     * One constructor with all fields
     * getter and setter methods for all fields
     * Override toString method
     * Think and implement a way how to calculate haw many objects of type Student were created(should be used static field).
     */
    private String name;

    private LocalDate birthDate;

    private static int count = 0;

    public Student(String name, LocalDate birthDate) {
        this.name = name;

        this.birthDate = birthDate;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public static int countOfObject() {
        //petq chi tpel methody menak arjeqy veradarcnelu hamara patasxanatu
        System.out.print("Count of object ");
        return count;
    }

    @Override
    public String toString() {
        return "[ " + "Name: " + name  + ", BirthDate: " + birthDate + " ]";
    }
}
