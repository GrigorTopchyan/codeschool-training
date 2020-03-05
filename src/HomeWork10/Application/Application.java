
package HomeWork10.Application;

import java.util.Arrays;

public class Application {
    private User [] users;

    public Application(User[] users) {
        this.users = users;
    }

    public static class ApplicationType{
        final static String FACEBOOK="";
        final static String VIBER="";
        final static String GMAIl="";

    }
    public class User{

       public String userName;
        public String password;
       public String applicationType;
        boolean isLoggedIn =false;

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
        public void login(boolean isLoggedIn){
            setLoggedIn(true);
        }
        private void  logout(boolean isLoggedIn){
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
    public interface LoggedIn{
        public  void isLoggedIn(User user);

    }
     public void addUser(String userName,String password,String applicationType){
        User [] addUser= new User[users.length+1];

        for (int i = 0; i <users.length ; i++) {
            addUser [i]=users[i];
        }
        addUser[users.length]= new User(userName,password,applicationType);
        users=addUser;
    }

    public void deleteUser(String userName) {
        class Finder {
            public void finder(){
                for (
                        int i = 0;
                        i < users.length; i++) {
                    if (users[i].userName.equals(userName)) {
                        for (int j = i; j < users.length; j++) {
                            if (users[j] == users[users.length - 1]) {
                                users[j] = null;
                            } else {
                                users[j] = users[j + 1];
                            }
                        }
                        break;
                    }

                }
        }
        } Finder finder = new Finder();
        finder.finder();

    }
    public User[] allLoggedInUsers() {
        LoggedIn loggedIn = new LoggedIn() {
            @Override
            public void isLoggedIn(User user) {
                Arrays.fill(users, user);
            }
        }; return users;
    }

    @Override
    public String toString() {
        return "Application{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}





