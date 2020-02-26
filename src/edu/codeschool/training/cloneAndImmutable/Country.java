package edu.codeschool.training.cloneAndImmutable;

public final class Country implements Cloneable {
    private String name;
    private String nationality;
    private City capital;
    private Province[] provinces;

    public Country(String name, String nationality, City capital, Province[] provinces) {
        this.name = name;
        this.nationality = nationality;
        this.capital = capital;
        this.provinces = provinces;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public City getCapital() {
        return this.capital.clone();
    }

    public Province[] getProvinces() {
        return provinces.clone();
    }

    @Override
    protected Country clone() throws CloneNotSupportedException {
        Country country = (Country) super.clone();
        country.capital = this.capital.clone();
        country.provinces = this.provinces.clone();
        return country;
    }
}
