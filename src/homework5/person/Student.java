package homework5.person;

public class Student extends Person {
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



    @Override
    public String printInfo() {
        return "Name:" + super.getName() +'\n'+
                "Address: " + super.getAddress() +'\n'+
                "University: "+university+'\n'+"Fee: "+fee+'\n';
    }
}
