package edu.codeschool.training.classes_objects.homework4;

public class Author {


    private String gender;
    private String name;
    private String email;


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
        this.email = email;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Author(String name,String email,String gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;

    }

    public String getAuthorName(){
        return name;
    }




}
