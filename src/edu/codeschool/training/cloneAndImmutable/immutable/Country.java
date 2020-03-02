package edu.codeschool.training.cloneAndImmutable.immutable;

import java.util.Arrays;

public final class Country {
    private final String name;
    private final String nationality;
    private final City capital;
    private final Province[] provinces;

    public Country(String name, String nationality, City capital, Province[] provinces) throws CloneNotSupportedException {
        this.name = name;
        this.nationality = nationality;
        this.capital = (City) capital.clone();
        this.provinces = provinces.clone();
    }


    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public City getCapital() throws CloneNotSupportedException {
        City clone = (City) capital.clone();
        return clone;
    }

    public Province[] getProvinces() {
        return provinces.clone();
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
