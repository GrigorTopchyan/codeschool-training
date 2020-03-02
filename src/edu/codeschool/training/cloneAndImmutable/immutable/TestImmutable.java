package edu.codeschool.training.cloneAndImmutable.immutable;

public class TestImmutable {
    public static void main(String[] args) {

        City city = new City("Armavir",100,25);
        City [] cities = {city};
        Province province = new Province("Yerevan",374,city,cities);
        Province [] provinces = {province};
        Country country = new Country("Armenia","Hay",city,provinces);

    }

}

