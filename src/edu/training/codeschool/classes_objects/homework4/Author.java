package edu.training.codeschool.classes_objects.homework4;

import java.util.Date;

public class Author {
    public String name;
    private String email;
    private String gender;
    private int birtDate;

    public Author(String name, String email, String gender, int birtDate) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.birtDate = birtDate;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(int birtDate) {
        this.birtDate = birtDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birtDate=" + birtDate +
                '}';
    }
}
