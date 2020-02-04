package edu.codeschool.training.classes_objects.homework4;

public class TestAuthor {
    public static void main(String[] args) {

        Book book = new Book("Bob","James",100);

        System.out.println("Name book is :"+ book.getName()+" ;"
                + " Author name is :" +
                book.getAuthor()+ " ;" + " Price is book :"+ book.getPrice());

        System.out.println("Aftror of book is :" + book.getAuthor());

        //որ Book ը դզես էս էլ կուղղես

    }
}
