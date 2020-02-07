/*
 1.1 Create class with name Student. Student should have following state and behaviour:
     Three private fields name of type String, age of type int birthDate of type java.util.Date
     One constructor with all fields
     getter and setter methods for all fields
     Override toString method
     Think and implement a way how to calculate haw many objects of type Student were created(should be used static field).
 */

package edu.codeschool.training.classes_objects.homework5;

import java.util.Calendar;
import java.util.TimeZone;

public class Student1 {



    private String name;
    private int age;
    private Calendar birthDate;
    private static int numberOfObjects;



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

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Student1(String name, int age, Calendar birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        numberOfObjects++;


        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.set(2016, Calendar.JANUARY, 5, 12, 30, 0);
        //calendar.add(Calendar.DAY_OF_YEAR,-2);

    }

    public void printNumberOObjects(){
        System.out.println( "There are " + numberOfObjects +" objects in this class");
    }



    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }



}
