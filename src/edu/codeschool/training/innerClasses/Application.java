package edu.codeschool.training.innerClasses;

import java.util.Arrays;

public class Application {
    User[] users;

    static class ApplicationType {
        final static String FACEBOOK = "";
        final static String VIBER = "";
        final static String GMAIL = "";
    }

    class User {
        String userName;
        String password;
        String applicationType;
        boolean isLoggedIn = false;

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

        public boolean isLoggedIn() {
            return isLoggedIn;
        }

        public void setLoggedIn(boolean loggedIn) {
            isLoggedIn = loggedIn;
        }

        public boolean login() {
            setLoggedIn(this.isLoggedIn);
            return true;
        }

        public boolean logout() {
            setLoggedIn(this.isLoggedIn);
            return false;
        }
    }

    interface LoggedIn {
        boolean isLoggedIn(User user);
    }

    public void addUser(String userName, String password, String applicationType) {
        User user = new User(userName, password, applicationType);
        user.userName = userName;
        user.password = password;
        user.applicationType = applicationType;
        User[] users = new User[100];
        User temp;
        for (int i = 0; i < users.length / 2; i++) {
            temp = users[i];
            users[i] = users[users.length - 1 - i];
            users[users.length - 1 - i] = temp;

        }
    }
}



