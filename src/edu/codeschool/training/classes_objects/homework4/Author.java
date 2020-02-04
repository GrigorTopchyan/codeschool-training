package edu.codeschool.training.classes_objects.homework4;

public class Author {


    private String gender;
    private String name;
    private String email;

    //birthDate դաշտը չկա


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

    //Ստեղ խնդրի պահանջի մեջ պրոբլեմ կար դզել եմ էս մեթոդը պիտի Book ի մեջ լինի
    public String getAuthorName(){
        return name;
    }




}
