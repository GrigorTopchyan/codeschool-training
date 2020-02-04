package edu.training.codeschool.HomeWork4.classes_objects;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(123,"Jone",
                "Smith", 200);


        System.out.println(employee.toString());

        System.out.println("AnnualSalary = "+  employee.getAnnualSalary());

        System.out.println("Percent = "+ employee.Percent(46));

    }
}
