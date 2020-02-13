package homework6.task5.personviewer;


import homework6.task5.person.IPerson;

/**
 *  4.5. Create a subclass of the PersonViewer object that has the following modifications:
 *                   a. Overrides the view method, and uses the instanceof test to determine the actual type of the object (e.g. Employee), and then casts it appropriately.
 *                   b. Create three methods called viewPerson, that vary by their input parameters. I.e. create one that accepts an Employee another that accepts a Lecturer and a third method that accepts a Student.
 *                   c. Implement these methods so they write out to the console all information available about the objects. E.g. for an Employee write out its name, email and department.
 *                   d. Finally add a main method to EnhancedPersonViewer that creates instances of each different type of person, and then invokes the view method on each.
 */

public class SubPersonViewer extends PersonViewer {

    public IPerson instanceOfTest(IPerson person) {
        return person;

    }

/////// pahanj@ chhaskaca es metodov inch pti anem?
    @Override
    public String viewer(IPerson person) {
        return  "   ";
    }
}
