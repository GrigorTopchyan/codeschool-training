package HomeWork8.HomeTask2;

public class Department {
    private String name;
    private  long employeeCount;

    public Department(String name, long employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Department)obj).name)&&
         this.employeeCount==(((Department)obj).employeeCount);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
