package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Author;
import edu.codeschool.training.classes_objects.homework4.Book;
import edu.codeschool.training.classes_objects.homework4.Date;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Book book = new Book("book name", 15, new Author("author name", "mail", "man",
                new Date(12, 8, 1995))) {
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter book name ");
        String bookName = sc.nextLine();
        System.out.println("Price is ");
        double priceNumber = sc.nextDouble();
        System.out.println("Please enter author name ");
        String authorName = sc.nextLine();
        String aaa = sc.nextLine();
        System.out.println("Please enter email ");
        String email = sc.nextLine();
        System.out.println("Please enter gender ");
        String gender = sc.nextLine();
        System.out.println("Please enter date ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

    }
}
