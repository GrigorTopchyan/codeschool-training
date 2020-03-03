package edu.codeschool.training.innerClasses;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Application.User [] useers = new Application.User[3];
        Application application = new Application(useers);
        Application.User user =application.new User("Ashotik","ba chimacar", Application.ApplicationType.FACEBOOK);
        application.addUser("yomayo","aaaa de","ahan vay");
        System.out.println( application.toString());

    }
}
