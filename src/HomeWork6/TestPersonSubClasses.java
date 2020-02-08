package HomeWork6;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        StudentForPerson student= new StudentForPerson("Ann","USA","Oxford",20 );
        Employee employee= new Employee("Arman","Armenia","office",120000);

        System.out.println(student);
        System.out.println(employee);
    }
}
