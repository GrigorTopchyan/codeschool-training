package HomeWork7.HomeTask6;

public class Lecturer implements  Person {
    public String subject;

    public String getSubject() {
        return subject;
    }

    @Override
    public void getDescription() {
        System.out.println(getSubject()+"teaches ");
    }
}
