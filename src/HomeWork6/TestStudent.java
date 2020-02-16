package HomeWork6;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student one= new Student("Ann",20, new Date());
       Student two= new Student("Mary",21,new Date());
        Student three= new Student("jhon",20,new Date());
        System.out.println(Student.getCountOfCreatedObjects());
    }
}
