package HomeWork10.Application;

public class testy {
    public static void main(String[] args) {
        Application.User [] users = {};
        Application application = new Application(users);
        application.addUser("Maxim","maximus",Application.ApplicationType.FACEBOOK);
        application.addUser("Arman","aramus",Application.ApplicationType.GMAIl);
        System.out.println(application.toString());
        application.deleteUser("Maxim");

        System.out.println(application.toString());


    }

}
