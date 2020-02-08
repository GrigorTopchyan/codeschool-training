package edu.training.codeschool.classes_objects.homework4.client;

import edu.training.codeschool.classes_objects.homework4.Author;
import edu.training.codeschool.classes_objects.homework4.Book;

public class TestAuther {
    public static void main(String[] args) {
        Book book=new Book("Samvel",25000,new Author("Rafi","Raffi.Xachagox@gmail.com","m",1835));
        System.out.println(book);
    }
}
