package edu.codeschool.training.classes_objects.homework4;

import java.awt.print.Book;

public class Author {
    private String name;
    private String email;
    private Date birdDate;
    private String gender;


    public Author(String name, String email, String gender, Date birdDate) {
        this.birdDate = birdDate;
        this.name = name;
        this.email = email;
        this.gender = gender;
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
        this.email = email;
    }

    public Date getBirdDate() {
        return birdDate;
    }

    public void setBirdDate(Date birdDate) {
        this.birdDate = birdDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuthorName(String name) {
        Book book = new Book();
        return name;
    }
}
