package edu.codeschool.training.classes_objects.homework7.wrappers.classes;

import java.util.Objects;

public class Test2 {

    public static void main(String[] args) {

        Address address1 = new Address("USA","Shikago","Main streat",454544343);
        Address address2 = new Address("London","Brighton","Watford",2343434);
        Address address3 = new Address("France","Lion","Rue de la Republique",4874545);
        Address address4 = new Address("USA","Shikago","Main streat",454544343);


        System.out.println(address1.equals(address2));
        System.out.println(address2.equals(address3));
        System.out.println(address3.equals(address4));
        System.out.println(address4.equals(address1));


    }

}



class Address {

    String country;
    String city;
    String street;
    long postalCode;


    public Address(String country, String city, String street, long postalCode){
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }


    @Override
    public boolean equals(Object obj){
        Address address =(Address)obj;
        return postalCode == address.postalCode &&
                Objects.equals(country, address.country) &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street);
      }
}
