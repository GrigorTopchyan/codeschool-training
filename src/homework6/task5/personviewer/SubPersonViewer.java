package homework6.task5.personviewer;

import homework6.task5.educationalinstitution.Employee;
import homework6.task5.person.IPerson;
import homework6.task5.person.Person;

public class SubPersonViewer extends PersonViewer {
    public boolean instanceOfTest(IPerson person){
        return true;

        }


    @Override
    public void viewer(IPerson[] person) {
        super.viewer(person);
    }
}
