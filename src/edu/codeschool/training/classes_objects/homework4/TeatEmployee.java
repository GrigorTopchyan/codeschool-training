package edu.codeschool.training.classes_objects.homework4;

public class TeatEmployee {
    public static void main(String[] args) {
       Employee employee = new Employee(1,"Poghos" , "Poghosyan",100);
      System.out.println(employee.toString());
        System.out.println("Raise the salry by 10 percent: "+employee.raiseSalary(10));
    }
}
