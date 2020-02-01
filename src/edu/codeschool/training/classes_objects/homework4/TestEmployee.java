package edu.codeschool.training.classes_objects.homework4;

public class TestEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee("John", "Smith");
        employee.setSalary(3000);
        employee.setId(1);



        System.out.println(employee.getFirstName()+ " "
                +employee.getLastName() + " receives a salary of " + employee.getSalary());

        System.out.println("Annual salary of the employee is : "+ employee.getAnnualSalary());

        System.out.println("10% higher salary is : " + employee.raiseSalary());

        System.out.println("Employee is : " + employee.getFirstName()
                + " "+ employee.getLastName() + " ," + "his id is "+ employee.getId());







    }
}
