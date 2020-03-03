package edu.codeschool.training.cloneAndImmutable.clone;

import java.util.Arrays;

public class Country {
    private String name;
    private String nationality;
    private City capital;
     Province [] provinces;

    public Country(String name, String nationality, City capital, Province[] provinces) {
        this.name = name;
        this.nationality = nationality;
        this.capital = capital;
        this.provinces = provinces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Province[] getProvinces() {
        return provinces;
    }

    public void setProvinces(Province[] provinces) {
        this.provinces = provinces;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Country cloneCountry = (Country) super.clone();
        City cityClone =(City) capital.clone();
        Province [] provinceCopy = provinces.clone();
        return cloneCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", capital=" + capital +
                ", provinces=" + Arrays.toString(provinces) +
                '}';
    }
}
