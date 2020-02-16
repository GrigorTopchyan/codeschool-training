package edu.codeschool.training.homework7.equals;

import java.util.Arrays;

public class Company {
    String name;
    Address address;
    Department [] departments;
    Contact contact;

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Company)obj).name) &&
                this.address.equals(((Company )obj).address) &&
                Arrays.equals(this.departments,(((Company)obj).departments)) &&
                this.contact.equals(((Company)obj).contact);
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
