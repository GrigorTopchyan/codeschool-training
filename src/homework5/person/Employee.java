package homework5.person;

public class Employee extends Person {

    private String office;
    private double salary;

    public Employee(String name, String address, String office, double salary) {
        super(name, address);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




        @Override
        public String printInfo(){
            return "Name: " + super.getName() + '\n' +
                    "Address: " + super.getAddress() + '\n' +
                    "Office: " + office + '\n' +
                    "Salary: " + salary+'\n';
        }
    }

