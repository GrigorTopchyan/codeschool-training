package edu.training.codeschool.homework_for_09_02_2020.homework_3;

public class Student extends Person{
    private String university;
    private double fee;

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
    public String getSuperString(){
        return super.toString();
    }
    @Override
    public String toString() {
        return "student " + getSuperString() +
                " university='" + university + '\'' +
                ", fee=" + fee +
                '}';
    }
}
