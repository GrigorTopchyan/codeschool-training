package HomeWork8.HomeTask2;

public class Address {
    private String country;
    private String city;
    private String street;
    private long postalCode;

    public Address(String country, String city, String street, long postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object obj) {
        return this.country.equals(((Address) obj).country) &&
                this.city.equals(((Address) obj).city) &&
                this.street.equals(((Address) obj).street) &&
                this.postalCode == (((Address) obj).postalCode);
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
