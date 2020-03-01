package edu.codeschool.training.classes_objects.HomeWork8.Task2;

public class Department {
   private String name;
   private long employeeCount;

    public Department(String name, long employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(long employeeCount) {
        this.employeeCount = employeeCount;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Department: " + '\n' + "   Name: " + name + '\n' + "   Employee count: " + employeeCount;
    }
}
