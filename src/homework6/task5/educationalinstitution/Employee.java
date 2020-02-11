package homework6.task5.educationalinstitution;

import homework6.task5.person.Person;

public class Employee extends Person {
    private String department;

    public Employee(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDescription() {
        return "Name "+getName()+" Department "+getDepartment();
    }
}
