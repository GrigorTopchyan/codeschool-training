package HomeWork7.HomeTask6;

public class Employee implements Person {
    public String department;

    public String getDepartment() {
        return department;
    }

    @Override
    public void getDescription() {
        System.out.println(getDepartment()+" is Employee department");
    }
}
