package edu.codeschool.training.homework7.equals;

public class Address {
    String country;
    String city;
    String street;
    long postalCode;

    @Override
    public boolean equals(Object obj) {
       return this.country.equals(((Address) obj).country) &&
                this.city.equals(((Address) obj).city) &&
                this.street.equals(((Address)obj).street) &&
                this.postalCode == (((Address)obj).postalCode);
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
}
