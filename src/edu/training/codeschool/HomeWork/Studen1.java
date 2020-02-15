package edu.training.codeschool.HomeWork;

public class Studen1 extends Person {
    //dashtery piti private lini encapsulation ches pahel
        public String university;
        public double fee;

    public Studen1(String name, String adress, String university, double fee) {
        super(name, adress);
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
        return "Studen1{" +
                "university='" + university + '\'' +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
