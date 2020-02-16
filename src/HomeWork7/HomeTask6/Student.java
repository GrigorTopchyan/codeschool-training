package HomeWork7.HomeTask6;

public class Student implements Person {
    public String name;
    public String email;
    public String grade;

    public String getGrade() {
        return grade;
    }

    @Override
    public void getDescription() {
        System.out.println(getGrade() +"student grade");
    }
}
