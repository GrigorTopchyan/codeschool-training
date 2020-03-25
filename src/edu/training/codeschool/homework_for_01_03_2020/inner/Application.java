//package edu.training.codeschool.homework_for_01_03_2020.inner;
//
//import java.util.Objects;
//
//public class Application {
//    private User[] users;
//
//    public static class ApplicationType {
//        private final static String FACEBOOK = null;
//        private final static String VIBER = null;
//        private final static String GMAIL = null;
//
//
//    }
//
//    public class User {
//        private String userName;
//        private String password;
//        private String applicationType;
//        private boolean isLoggedIn = false;
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof User)) return false;
//            User user = (User) o;
//            return isLoggedIn() == user.isLoggedIn() &&
//                    Objects.equals(getUserName(), user.getUserName()) &&
//                    Objects.equals(getPassword(), user.getPassword()) &&
//                    Objects.equals(getApplicationType(), user.getApplicationType());
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(getUserName(), getPassword(), getApplicationType(), isLoggedIn());
//        }
//
//        public User(String userName, String password, String applicationType) {
//            this.userName = userName;
//            this.password = password;
//            this.applicationType = applicationType;
//        }
//
//        public String getUserName() {
//            return userName;
//        }
//
//        public void setUserName(String userName) {
//            this.userName = userName;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//
//        public String getApplicationType() {
//            return applicationType;
//        }
//
//        public void setApplicationType(String applicationType) {
//            this.applicationType = applicationType;
//        }
//
//        public boolean isLoggedIn() {
//            return isLoggedIn;
//        }
//
//        public void setLoggedIn(boolean loggedIn) {
//            isLoggedIn = loggedIn;
//        }
//
//        public void login() {
//            isLoggedIn = true;
//        }
//
//        public void logout() {
//            isLoggedIn = false;
//        }
//
//    }
//
//    public interface LoggedIn {
//        boolean isLoggedIn(User user);
//    }
//
//    void addUser(User user) {
//        User[] usersadd = new User[users.length + 1];
//        for (int i = 0; i < users.length; i++) {
//            usersadd[i] = users[i];
//        }
//        usersadd[users.length] = user;
//        users = usersadd;
//    }
//
//    void deleteUser(String userName) {
//        class Finder {
//             private User findUserByUsername(String userName) {
//                for (User user : Application.this.users) {
//                    if (user.getUserName().equals(userName)) {
//                        return user;
//                    }
//                }
//                return null;
//            }
//        }
//        for (int i = 0; i < users.length; i++) {
//            if (users[i].equals(new Finder().findUserByUsername(userName))) {
//                deleteUserOnIndex(i);
//            }
//        }
//    }
//
//    private void deleteUserOnIndex(int removeIndex) {
//        for (int i = removeIndex; i < users.length - 1; i++) {
//            users[i] = users[i+1];
//        }
//        deleteUsersLastElement(users);
//    }
//
//    private void deleteUsersLastElement(User[] array) {
//        User[] newArray = new User[array.length - 1];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = array[i];
//        }
//        users = newArray;
//    }
//
//    User[] allLoggedInUsers(){
//        LoggedIn loggedIn = new LoggedIn() {
//            @Override
//            public boolean isLoggedIn(User user) {
//                return user.isLoggedIn;
//            }
//
//        };
//        return null;
//    }
//}
//
//
