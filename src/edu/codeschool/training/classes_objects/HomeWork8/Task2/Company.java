package edu.codeschool.training.classes_objects.HomeWork8.Task2;

public class Company {
    private String name;
    private Address address;
    private Deprecated[] deprecateds;
    private Contact contact;

    public Company(String name, Address address, Deprecated[] deprecateds, Contact contact) {
        this.name = name;
        this.address = address;
        this.deprecateds = deprecateds;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Deprecated[] getDeprecateds() {
        return deprecateds;
    }

    public Contact getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDeprecateds(Deprecated[] deprecateds) {
        this.deprecateds = deprecateds;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
