package edu.codeschool.training.classes_objects.homework4;

public class Book {


    private String author;
    private String name;
    private double price;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public Book(String name,String author,double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return name+price+author;
    }

}

