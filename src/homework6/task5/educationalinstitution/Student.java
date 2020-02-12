package homework6.task5.educationalinstitution;


import homework6.task5.person.Person;

/**
 * 4.1. Create a Student class that implements the Person interface.
 * As well as storing the students name and email, also store their course grade (e.g A, B, C) in a member variable.
 * The grade should be accessible via a getGrade method.
 * For the implementation of getDescription return a message
 * along the lines of “A C grade student”, substituting the students actual grade.
 */
public class Student extends Person {
    private char grade;

    public Student(String name, String email, char grade) {
        super(name, email);
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String getDescription() {

        return " Grade: " + grade + '\n' + " Student name: " + getName();

    }


}
