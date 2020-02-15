package edu.codeschool.training.classes_objects.homework7.wrappers.classes;

import java.util.Arrays;
import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {


        Department department1 = new Department("John",434333L);
        Department department2 = new Department("John",545434L);

        System.out.println(department1.equals(department2));

    }
}



class Department{

    String name;
    long employeeCount;

    public Department(String name,long employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public boolean equals(Object obj){
        Department department = (Department)obj;
        return name.equals(department.name) &&
                employeeCount ==department.employeeCount;
    }
    public String toString(){
        return name + employeeCount;
    }







}


