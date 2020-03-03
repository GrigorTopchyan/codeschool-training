package edu.codeschool.training.innerClasses;

import edu.codeschool.training.HomeWork6.Employee.Employee;

import java.util.Arrays;

public class Application {
    private User[] users;

    public Application(User[] users) {
        this.users = users;
    }

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

        public void login() {
            setLoggedIn(true);

        }

        public void logout() {
            setLoggedIn(false);
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

    interface LoggedIn {
        void isLoggedIn(User user);
    }

    public void addUser(String userName, String password, String applicationType) {
        User user = new User(userName, password, applicationType);
        int arraySize = 0;
        if (arraySize == users.length) {
            User [] array = new User[users.length * 2];
            for (int i = 0; i < users.length; i++) {
                array[i] = users[i];
            }
            users = array;
        }
        users[arraySize++] = user;
    }


    public void deleteUser(String username) {
        class Finder {
            public void finder() {
                for (
                        int i = 0;
                        i < users.length; i++) {
                    if (username.equals(users[i].userName)) {
                        for (int j = i; j < users.length; j++) {
                            users[j] = users[j + 1];
                            if (users[j] == users[users.length - 1])
                                users[users.length - 1] = null;

                        }
                        break;
                    }
                }
            }

        }
        Finder finder = new Finder();
        finder.finder();
    }

    public User [] allLoggedInUsers(){
        new LoggedIn() {
            @Override
            public void isLoggedIn(User user) {
                for (int i = 0; i <users.length ; i++) {
                    users[i] = user;
                }
            }
        };
        return users;
        //ay ste harcer kan,,,orinak mer method@ xia User user uzum
    }

    @Override
    public String toString() {
        return "Application{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}



