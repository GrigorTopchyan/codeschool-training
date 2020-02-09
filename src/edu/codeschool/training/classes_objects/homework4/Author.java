package edu.codeschool.training.classes_objects.homework4;

public class Author {
    private String name;
    private String email;
    private Date birdDate;
    private String gender;
    private Author author;

    public Author(String name,String email,Date birdDate  ,String gender) {
        this.name = name;
        this.email = email;
        this.birdDate = birdDate;
        this.gender = gender;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(){
        this.email = email;
    }
    public Date getBirdDate(){
        return birdDate;
    }
    public void setBirdDate(){
        this.birdDate = birdDate;
    }
    public String getGender() {
        return gender;
    }
    public void setGender (){
        this.gender = gender;

    }
    }

