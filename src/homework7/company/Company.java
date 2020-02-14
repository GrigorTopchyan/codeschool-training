package homework7.company;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
