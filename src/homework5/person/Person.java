package homework5.person;

public abstract class Person {
    /**
     * 3.1 Create abstract class Person:
     *                          The class should have name of type String, address of type String
     *                          Initialize the fields with default values John, Armenia,Yerevan respectively inside non static initialization block.
     *                          One constructor with name and address parameters
     *                          Create getter and setter methods for all fields
     *                          Override toString() method.
     *                          Create class Student which should have all properties of Person class plus Student has university of type String, fee of type double
     *                          Create constructor with name, address, university and fee parameters
     *                          Create getter and setter methods for all fields
     *                          Override toString() method which returns all information for Student object
     *                          Create class Employee which should have all properties of Person class plus Employee has office of type String, salary of type double
     *                          Create constructor with name, address, office and salary parameters
     *                          Create getter and setter methods for all fields
     *                          Override toString() method which returns all information for Employee object
     */
    private String name="John";
    private String address="Armenia, Yerevan";

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
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


    public abstract String printInfo() ;

}
