package homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();


        application.addUser("A","123", Application.ApplicationType.VIBER);
        application.addUser("c","123", Application.ApplicationType.FACEBOOK);
        application.addUser("d","123", Application.ApplicationType.VIBER);

//        application.deleteUser("A");

    }
}
