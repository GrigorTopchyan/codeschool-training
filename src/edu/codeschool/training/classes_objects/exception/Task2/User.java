package edu.codeschool.training.classes_objects.exception.Task2;

public class User {

    private String name;
    private String email;
    private String pass;

    public User(String name, String email, String pass) {

        this.name = name;
        this.email =email;
        this.pass = pass;
        if (pass.length()<8){
            throw new IllegalPasswordException("False pass");
        }
        if (!(email.contains("@"))){
            throw new IllegalEmailException("False email");
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
    public void setEmail(String email) throws IllegalEmailException  {
        if (!(email.contains("@"))){
            throw new IllegalEmailException("False email");
        }
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) throws IllegalPasswordException {

        if (pass.length()<8){
            throw new IllegalPasswordException("False pass");
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
