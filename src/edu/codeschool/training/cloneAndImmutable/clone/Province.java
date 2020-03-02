package edu.codeschool.training.cloneAndImmutable.clone;

import java.util.Arrays;

public class Province implements Cloneable {
    String name;
    long mobileCode;
    City centreCity;
    City [] cities;

    public Province(String name, long mobileCode, City centreCity, City[] cities) {
        this.name = name;
        this.mobileCode = mobileCode;
        this.centreCity = centreCity;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(long mobileCode) {
        this.mobileCode = mobileCode;
    }

    public City getCentreCity() {
        return centreCity;
    }

    public void setCentreCity(City centreCity) {
        this.centreCity = centreCity;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Province clonedProvince = (Province) super.clone();
        City clonedCity = (City)centreCity.clone();
        City [] citiesClone =cities.clone();
        clonedProvince.setCentreCity(clonedCity);
        clonedProvince.setCities(citiesClone);
        return clonedProvince;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", mobileCode=" + mobileCode +
                ", centreCity=" + centreCity +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
