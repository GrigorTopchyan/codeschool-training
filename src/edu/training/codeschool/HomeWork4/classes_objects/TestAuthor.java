package edu.training.codeschool.HomeWork4.classes_objects;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {

        Book book = new Book("Aregak", 54, new Author("Teryan", "teryanmail", "man", new Date(12, 12, 1912)));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book name ");
        String name = sc.nextLine();
        System.out.println("price");
        int price = sc.nextInt();
        System.out.println("author name ");
        String authorName = sc.nextLine();
        String a=sc.nextLine();
        System.out.println("email");
        String email = sc.nextLine();
        System.out.println("gender");
        String gender = sc.nextLine();
        System.out.println("autor birtday");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

    }
} // Harc vonc scanneric grenq obyekti tipery
