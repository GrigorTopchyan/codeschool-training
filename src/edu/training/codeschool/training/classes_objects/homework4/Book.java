package edu.training.codeschool.training.classes_objects.homework4;

public class Book {
    /**
     * 8.1 Class has following state and behaviour:
     * Three private instance variables:
     * name of type String
     * author of type Author
     * price of type double
     * Create one constructor with name, author and price parameters.
     * Create getter and setter methods for all fields.
     * Create toString() method which returns string representation of the Book object in this format
     * Book[name=?, Author [name=?,email=?, gender=?, birthDate=?], price=?]
     */
    private String name;
    private Author author;
    private double price;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book "+"[" + "book name = " + getName() + " [" + "Author:  " + author.getName() + ", author email : "
                + author.getEmail() + ", gender : " +
                author.getGender() + ", birthday " + author.getBirdDate() + "  ]" + ", price = " + getPrice() + "]";
    }

}
