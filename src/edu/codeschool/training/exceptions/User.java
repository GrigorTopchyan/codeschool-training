package edu.codeschool.training.exceptions;

public class User {
    String name;
    String email;
    String password;

    public User(String name, String email, String password) {
        this.name = name;
        if (name.contains("@")) {
            this.name = name;
        } else throw new IllegalEmailException("PLease enter correct email");
        if (password.length() > 8) {
            this.password = password;
        } else throw new IllegalPasswordException("Password length should be minimum 8 characters");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("@")) {
            this.name = name;
        } else throw new IllegalEmailException("PLease enter correct email");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() > 8) {
            this.password = password;
        } else throw new IllegalPasswordException("Password length should be minimum 8 characters");
    }
}
