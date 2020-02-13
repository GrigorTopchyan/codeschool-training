package homework6.task5.personviewer;

import homework6.task5.educationalinstitution.Employee;
import homework6.task5.educationalinstitution.Lecturer;
import homework6.task5.educationalinstitution.Student;
import homework6.task5.person.IPerson;

public class PersonViewerTest {
    /**
     * 4.4. Create a class called PersonViewerTest. Implement a main method that
     * a. Creates a PersonViewer object using the provided classes.
     * b. Create instances of the Lecturer, Employee and Student classes and invokes the view method of the PersonViewer on each of them.
     * c. Can you identify what is happening?
     */
    public static void main(String[] args) {
        IPerson lecturer = new Lecturer("Arman", "lector@gmail.com", "Mathematics");
        IPerson employee = new Employee("Alex", "employee@gmail.com", "banks");
        IPerson student = new Student("Ani", "student@gmaail.com", 'A');
        IPerson[] people = {lecturer, employee, student};

        PersonViewer personViewer = new PersonViewer();
        for (int i = 0; i <people.length ; i++) {
            System.out.println(personViewer.viewer(people[i]));
        }


    }
}
