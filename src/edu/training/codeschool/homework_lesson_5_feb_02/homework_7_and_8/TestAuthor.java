package edu.training.codeschool.homework_lesson_5_feb_02.homework_7_and_8;

import edu.training.codeschool.homework_lesson_5_feb_02.homework_4.Date;

public class TestAuthor {
    public static void main(String[] args) {

        Book book = new Book("Game of thrones", new Author(1,"george Martin", "george@gmail.com", new Date(10,12,12), "male"), 100);
        System.out.println(book.getAuthorName());

        System.out.println(book);
    }
}
