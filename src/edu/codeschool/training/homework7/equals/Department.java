package edu.codeschool.training.homework7.equals;

public class Department {
    String name;
    long employeeCount;

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Department)obj).name) &&
                this.employeeCount == (((Department)obj).employeeCount);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
