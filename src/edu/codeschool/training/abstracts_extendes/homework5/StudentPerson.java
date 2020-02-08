package edu.codeschool.training.abstracts_extendes.homework5;

import edu.codeschool.training.abstracts_extendes.homework5.Person;

public class StudentPerson extends Person {
    String university;
    double fee;


    public StudentPerson(String name, String address, String university, double fee) {
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

    @Override
    public String toString() {
        return "StudentPerson{" +
                "university='" + university + '\'' +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
