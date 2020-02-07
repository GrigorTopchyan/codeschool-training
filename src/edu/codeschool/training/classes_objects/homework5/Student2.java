/*
 Create class Student which should have all properties of Person class
  plus Student has university of type String, fee of type double
 Create constructor with name, address, university and fee parameters
 Create getter and setter methods for all fields
 Override toString() method which returns all information for Student object
 */
package edu.codeschool.training.classes_objects.homework5;

public class Student2 extends Person {


    String university;
    double fee;

    public Student2(String name, String address, String university, double fee) {
        super(name, address);
        this.university = university;
        this.fee = fee;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    public Student2(String name, String address) {
        super(name, address);
    }


    @Override
    public String toString() {
        return "Student2 {" +
                " university = '" + university + '\'' +
                ", fee = " + fee +
                ", name='" + name + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}
