/*
  3.1 Create abstract class Person:
     The class should have name of type String, address of type String
     Initialize the fields with default values John, Armenia,Yerevan respectively inside non static initialization block.
     One constructor with name and address parameters
     Create getter and setter methods for all fields
     Override toString() method.

 */
package edu.codeschool.training.classes_objects.homework5;

public abstract class Person {

    //պիտի private լինեն encapsulation խախտել ես
    public String name;
    public String address;

    //դեֆոլթ արժեքները պիտի non static initialization block ում լինի


    public Person(String name, String address) {

        this.name = name;
        this.address = address;
        this.address = "Armenia,Yerevan";
        this.name = "John";
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



