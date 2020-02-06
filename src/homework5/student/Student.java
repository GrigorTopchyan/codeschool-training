package homework5.student;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    /**
     *  1.1 Create class with name Student. Student should have following state and behaviour:
     *                          Three private fields name of type String, age of type int birthDate of type java.util.Date
     *                          One constructor with all fields
     *                          getter and setter methods for all fields
     *                          Override toString method
     *                          Think and implement a way how to calculate haw many objects of type Student were created(should be used static field).
     */
    private String name;
    private int age;
    private GregorianCalendar birthDate ;
static {
    int count= 1;

    System.out.println(count++);
}

    public Student(String name, int age, GregorianCalendar birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
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

    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(GregorianCalendar birthDate) {
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
}
