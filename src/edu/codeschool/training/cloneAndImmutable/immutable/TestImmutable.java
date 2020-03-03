package edu.codeschool.training.cloneAndImmutable.immutable;

public class TestImmutable {
    public static void main(String[] args) throws CloneNotSupportedException {

        City armavir = new City("Armavir",100,25);
        City [] cities = {armavir};
        Province province = new Province("Yerevan",374,armavir,cities);
        Province [] provinces = {province};
        Country country = new Country("Armenia","Hay",new City("Armavir",100,25),provinces);
        City c = country.getCapital();
        c.setCountOfResidents(15);
        System.out.println(country.getCapital());

    }

}

