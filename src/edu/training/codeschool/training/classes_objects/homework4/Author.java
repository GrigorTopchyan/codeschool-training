package edu.training.codeschool.training.classes_objects.homework4;

public class Author {
    /**
     * The class has following state and behaviour:
     * Three private instance variables(fields) -
     * name of type String
     * email of type String
     * birtDate of type Date(your created Date)
     * gender of type String
     * One constructor with parameters id, name, email and gender.
     * Getter and setter methods for all fields.
     * Create getAuthorName() method which returns the author name of the book.
     */

    private String name;
    private String email;
    private Date birdDate;
    private String gender;
    private Author author;

    public Author(String name, String email, Date birdDate, String gender) {
        this.name = name;
        this.email = email;
        this.birdDate = birdDate;
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

    public Author getAuthorName() {

        return author;
    }
}
