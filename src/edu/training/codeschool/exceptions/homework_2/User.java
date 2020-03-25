package edu.training.codeschool.exceptions.homework_2;

public class User {
    private String name;
    private String email;
    private String password;
    boolean isTrue;
    public User(String name,  String email, String password)  {
        this.name = name;
        this.email = email;
        if (this.email.contains("@")) {
           this.isTrue = true;
        } else {
            throw new IllegalEmailException("invalid email");
        }
        this.password = password;
        if (this.password.length() >= 8) {
            this.isTrue = true;
        } else {
            throw new IllegalPasswordException("invalid passowrd");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (this.email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalEmailException("invalid email");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (this.password.length() >= 8) {
            this.password = password;
        } else {
            throw new IllegalPasswordException("invalid passowrd");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
