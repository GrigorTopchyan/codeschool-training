package HomeWork6;

public class StudentForPerson extends Person {
    private String university;
    private double fee;

    public StudentForPerson(String name, String address,String university
    ,double fee) {
        super(name, address);
        this.university=university;
        this.fee=fee;
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
        return "StudentForPerson{" +
                "university='" + university + '\'' +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

