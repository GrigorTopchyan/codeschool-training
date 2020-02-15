package edu.codeschool.training.classes_objects.homework7.wrappers.classes;

import java.io.ObjectInputStream;
import java.util.Objects;

public class Test4 {
    public static void main(String[] args) {

        Contact contact1 = new Contact("john@gmail.com","+1818434343","0032345432");
        Contact contact2 = new Contact("john@gmail.com","+1818434343","00345432");
        Contact contact3 = new Contact("john@gmail.com","+1818434343","0032345432");

        System.out.println(contact1.equals(contact2));
        System.out.println(contact2.equals(contact3));
        System.out.println(contact3.equals(contact1));


    }
}


 class Contact {
    String email;
    String phoneNumber;
    String mobileNumber;

     public Contact(String email, String phoneNumber, String mobileNumber) {
         this.email = email;
         this.phoneNumber = phoneNumber;
         this.mobileNumber = mobileNumber;
     }

     public boolean equals(Object obj){
         Contact contact = (Contact)obj;
         return email.equals(contact.email) &&
                 phoneNumber.equals(contact.phoneNumber) &&
                 mobileNumber.equals(contact.mobileNumber);
     }


     @Override
     public String toString() {
         return "Contact{" +
                 "email='" + email + '\'' +
                 ", phoneNumber='" + phoneNumber + '\'' +
                 ", mobileNumber='" + mobileNumber + '\'' +
                 '}';
     }
 }
