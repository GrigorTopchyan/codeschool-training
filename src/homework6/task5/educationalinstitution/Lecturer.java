package homework6.task5.educationalinstitution;


import homework6.task5.person.Person;

/**
 * 4.2. Create a Lecturer class that implements the Person interface.
 * This class should also store the subject that the lecturer teaches.
 * Add a getSubject method, and implement getDescription so that it returns a suitable message, e.g. “Teaches Biology”.
 */
public class Lecturer extends Person {
    private String subject;

    public Lecturer(String name, String email, String subject) {
        super(name, email);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getDescription() {
        return "Name"+getName()+" Subject "+getSubject();
    }
}
