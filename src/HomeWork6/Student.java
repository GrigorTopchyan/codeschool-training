package HomeWork6;

import java.util.Date;

/**  Three private fields name of type String, age of type int birthDate of type java.util.Date
 One constructor with all fields
 getter and setter methods for all fields
 Override toString method
 Think and implement a way how to calculate haw many objects of type Student were created
 (should be used static field).
**/
 public class Student {
     private String name;
     private int age;
     //arden import es arel karas miangamic Date gres
     private Date birthDate;
    private static int countOfCreatedObjects =0;{
        countOfCreatedObjects++;
    }

    public static int getCountOfCreatedObjects() {
        return countOfCreatedObjects;
    }

    public Student(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
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