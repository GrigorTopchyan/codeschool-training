package edu.codeschool.training.HomeWork6.Employee;

import java.util.Arrays;

public class Company {

    private int arraySize = 0;
    Employee [] array = new Employee[12];
    public Employee [] hireEmployee(Employee employee) {
        if(arraySize == array.length){
            Employee[] array1 = new Employee[array.length * 2];
            for (int i = 0; i <array.length ; i++) {
                    array1[i] = array[i];
            }
            array = array1;
        }
        array[arraySize++] = employee;
        return array;


    }

    public void startToWorking(){
        for (int i = 0; i <array.length ; i++) {
            array[i].doWork();
        }
    }
}
