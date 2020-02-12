package edu.codeschool.training.HomeWork6.Employee;

public class Company {
    Employee [] array = {new Designer("Des",21,200),new Programmer("Prog",22,400),new Tester("Test",21,600)};
    public Employee [] hireEmployee(Employee employee) {
        Employee[] array1 = new Employee[array.length + 1];
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
            array1[i] = array[j];
            array1[array1.length - 1] = employee;
            }

        }
        return array1;


    }
    //public Employee [] fireEmployee(Employee employee){

    }
//}
