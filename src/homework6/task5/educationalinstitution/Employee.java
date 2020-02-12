package homework6.task5.educationalinstitution;

import homework6.task5.person.Person;

/**
 * 4.3. Create a third class, Employee that implements the Person interface.
 * This should also store the name of the department the Employee works in (available via getDepartment). Again, getDescription should return a suitable message.
 */
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
        return "Employee name: " + getName() + '\n' + " Department: " + getDepartment();
    }
}
