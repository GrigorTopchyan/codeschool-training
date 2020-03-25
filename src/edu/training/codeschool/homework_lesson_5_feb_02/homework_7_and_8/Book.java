package edu.training.codeschool.homework_lesson_5_feb_02.homework_7_and_8;

public class Book {
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

    String getAuthorName() {
        return author.getName();
    }
    public String toString(){
        return (" Book [ name = " + name + ", " +
                " Author [ name = " + author.getName() + ", " +
                " email = " + author.getEmail() +  ", " +
                " gender = " + author.getGender() +  ", " +
                " birthDate = " + author.birthDate + " ] " +  ", " +
                "price = " + price + " ]");

    }
}