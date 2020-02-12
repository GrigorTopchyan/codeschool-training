package edu.codeschool.training.HomeWork6.univercity;

public class Lecturer implements Person {
    String subject;

    public Lecturer(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void getDescription() {
        System.out.println("Teaches " + getSubject());
    }
}
