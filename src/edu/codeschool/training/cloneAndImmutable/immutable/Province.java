package edu.codeschool.training.cloneAndImmutable.immutable;

import java.util.Arrays;

public class Province implements Cloneable {
    private String name;
    private long mobileCode;
    private City centreCity;
    private City[] cities;

    public Province(String name, long mobileCode, City centreCity, City[] cities) throws CloneNotSupportedException {
        this.name = name;
        this.mobileCode = mobileCode;
        this.centreCity =(City)centreCity.clone();
        this.cities = cities.clone();
    }


    public long getMobileCode() {
        return mobileCode;
    }
    public City getCentreCity() {
        return centreCity;
    }
    public City[] getCities() {
        return cities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileCode(long mobileCode) {
        this.mobileCode = mobileCode;
    }

    public void setCentreCity(City centreCity) {
        this.centreCity = centreCity;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Province clonedProvince = (Province) super.clone();
        City clonedCity = (City)centreCity.clone();
        City[] citiesClone =cities.clone();
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
