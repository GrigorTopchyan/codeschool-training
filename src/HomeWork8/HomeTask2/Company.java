package HomeWork8.HomeTask2;

import java.util.Arrays;

public class Company {
    private String name;
    private Address address;
    private Department[] departments;
    private Contact contact;

    public Company(String name, Address address, Department[] departments, Contact contact) {
        this.name = name;
        this.address = address;
        this.departments = departments;
        this.contact = contact;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Company) obj).name) &&
                this.address.equals(((Company) obj).address) &&
                Arrays.equals(this.departments, ((Company) obj).departments) &&
                this.contact.equals(((Company) obj).contact);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", departments=" + Arrays.toString(departments) +
                ", contact=" + contact +
                '}';
    }
}
