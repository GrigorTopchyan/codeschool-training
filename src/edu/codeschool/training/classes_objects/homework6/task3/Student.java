package edu.codeschool.training.classes_objects.homework6.task3;

public class Student extends Person {
   private String university;
   private double fee;
    private String name;
    private String address;

    public Student(String name, String address, String university, double fee) {
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


    public Student(String name, String address) {
          super(name, address);
    }


    @Override
    public String toString() {
        return "Student {" +
                " university = '" + university + '\'' +
                ", fee = " + fee +
                ", name='" + name + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}
