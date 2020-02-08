package edu.codeschool.training.abstracts_extendes.homework5;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private java.util.Date birthday;

    public Student(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public static int calculateQuantityStudents = 0 ;
    {
     calculateQuantityStudents++;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", birthday=" + birthday + '}';
    }
}
