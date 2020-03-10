package homework9;

import java.util.Arrays;

public class User {
    public int count = 1;
    User[] arrs = new User[count];
    String name;
    String lName;


    public User() {
    }

    public User(String name, String lName) {
        this.name = name;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return " name='" + name + '\n' + " lName='" + lName + '\n';

    }


    static class App {
        public int count = 1;
        User[] arrs = new User[count];

        public void makeUser(String name, String lName) {
            count++;
            User user1 = new User(name, lName);
            for (int i = 0; i < arrs.length; i++) {
                if (i == (arrs.length - 1)) {
                    arrs[i] = user1;
                }
                System.out.println(Arrays.toString(arrs));
            }
        }
    }

    public static void main(String[] args) {
        User.App app = new App();
        User.App app1 = new App();
        User.App app2 = new App();

        app.makeUser("0", "0");



        app1.makeUser("2", "2");

        app2.makeUser("3", "3");



    }

}
