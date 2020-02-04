package edu.training.codeschool.HomeWork4.classes_objects;

public class Author {
    // Three private instance variables(fields) -
    //name of type String
    //email of type String
    //birtDate of type Date(your created Date)
    //gender of type String
    private String name = "";
    private String email = "";
    private Date birtDate = new Date(12, 12, 2012);
    private String gender = "";


    Author(String name, String email,  String gender,Date birtDate) {
        this.name = name;
        this.email = email;
        this.birtDate = birtDate;
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
        return birtDate;
    }

    public void setBirdDate(Date birdDate) {
        this.birtDate = birdDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuthorName(Book book) {
        return name;
    }
}
