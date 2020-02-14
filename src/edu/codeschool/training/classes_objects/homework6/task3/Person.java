package edu.codeschool.training.classes_objects.homework6.task3;

public abstract class Person {
    private String name;
    private String address;


    public Person(String name, String address) {

        this.name = name;
        this.address = address;

        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }


}
