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

        app.makeUser("0", "0");


        app.makeUser("1", "1");

        app.makeUser("2", "2");

        app.makeUser("3", "3");

        app.makeUser("4", "4");

        app.makeUser("5", "5");

    }

}
