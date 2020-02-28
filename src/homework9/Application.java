package homework9;

import java.util.Arrays;

public class Application {
    private User[] users;
    int userCount = 1;
    static class ApplicationType {
        public final static String FACEBOOK = "FACEBOOK";
        public final static String VIBER = "VIBER";
        public final static String GMAIL = "GMAIL";
    }

     class User {
        private String userName;
        private String password;
        private String applicationType;
        private boolean isLoggedIn = false;


        public User(String userName, String password, String applicationType) {
            this.userName = userName;
            this.password = password;
            this.applicationType = applicationType;

        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getApplicationType() {
            return applicationType;
        }

        public void setApplicationType(String applicationType) {
            this.applicationType = applicationType;
        }

        public boolean login(boolean isLoggedIn) {
            return isLoggedIn;
        }

        public boolean logout(boolean isLoggedIn) {
            return isLoggedIn;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", applicationType='" + applicationType + '\'' +
                    '}';
        }
    }

    public void addUser(String userName, String password, String applicationType) {
        Application.User user = new User(userName, password, applicationType);

        userCount++;
        users = new User[userCount];

        for (int i = 0; i < users.length; i++) {
            if (i == (users.length - 1)) {
                users[i] = user;
            }
            System.out.println(Arrays.toString(users));
        }

    }

    public void deleteUser(String userName) {

//        User[] uz = new User[users.length-1] ;
        for (int i = 0; i < Application.this.users.length - 1; i++) {
            if (Application.this.users[i].getUserName().equals(userName)) {
                Application.this.users[i].setUserName("");
                Application.this.users[i].setApplicationType("");
                Application.this.users[i].setPassword("");


            }
        }
        System.out.println(Arrays.toString(users));
    }

    interface LoggedIn {
        boolean isLoggedIn(User user);
    }

    @Override
    public String toString() {
        return "Application{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
