package homework5.test;

import homework5.person.Employee;
import homework5.person.Person;
import homework5.person.Student;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        Person  student = new Student("John","Yerevan","EPH", 12.5);
        System.out.println(student.printInfo());
        Person employee = new Employee("Alex","Dilijan","Microsoft",5777.6);
        System.out.println(employee.printInfo());
    }
}
