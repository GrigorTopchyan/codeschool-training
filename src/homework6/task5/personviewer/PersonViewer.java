package homework6.task5.personviewer;

import homework6.task5.person.IPerson;

/**
 *    4.4. Create a class called PersonViewerTest. Implement a main method that
 *                   a. Creates a PersonViewer object using the provided classes.
 *                   b. Creates instances of the Lecturer, Employee and Student classes and invokes the view method of the PersonViewer on each of them.
 *                   c. Can you identify what is happening?
 */

public class PersonViewer {

    public String viewer(IPerson person) {

        return person.getDescription();


    }


}
