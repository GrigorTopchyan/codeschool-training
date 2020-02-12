package homework6.task5.personviewer;

import homework6.task5.person.IPerson;


public class PersonViewer {

    public void viewer(IPerson[] person){

        for (int i = 0; i < person.length ; i++) {
            System.out.println(person[i].getDescription());  ;
        }

    }


}
