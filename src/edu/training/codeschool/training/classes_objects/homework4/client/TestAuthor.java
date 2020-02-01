package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.Author;
import edu.training.codeschool.training.classes_objects.homework4.Book;
import edu.training.codeschool.training.classes_objects.homework4.Date;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class TestAuthor {
    /**
     * Create class with name TestAuthor in edu.codeschool.training.classes_objects.homework4.client package.
     *                          Inside main method create object of type Book.
     *                          Print the object to console.
     *                          Print the name of the author of the book to console.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name: ");
        String nameBook = scanner.nextLine();

        System.out.println("Enter author name: ");
        String authorName = scanner.nextLine();

        System.out.println("Enter author email: ");
        String authorEmail = scanner.nextLine();

        System.out.println("Enter author gender: ");
        String authorGender = scanner.nextLine();

        System.out.println("Enter author birth year ");
        int birthYear = scanner.nextInt();

        System.out.println("Enter author birth month ");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter author birthday ");
        int birthday = scanner.nextInt();


        System.out.println("Enter book price: ");
        double bookPrice = scanner.nextDouble();
        Date  data = new Date();
        data.setYear(birthYear);
        data.setMonth(birthMonth);
        data.setDay(birthday);
        Author author = new Author(authorName,authorEmail,data,authorGender);
        Book  book = new Book(nameBook,author,bookPrice);
        System.out.println(book.toString());
    }
}
