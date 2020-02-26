package homework8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        City[] citiesOfSyunikProvince = {
                new City("Kapan", 152482222L, 452),
                new City("Goris", 556565L, 965),
                new City("Meghri", 521565L, 4834),
                new City("Sisian", 123456L, 56),
                new City("Kadjaran", 73456L, 89)
        };
        City[] citiesOfShirakProvince = {
                new City("Gyumri", 45667877L, 23),
                new City("Maralik", 1234343L, 43),
                new City("Artik", 54545L, 65),

        };
        City[] citiesOfKotaykProvince = {
                new City("Razdan", 12234L, 63),
                new City("Eghvard", 1234343L, 963),
                new City("Tcaghkadzor", 354545L, 435),
                new City("Abovyan", 43445L, 5435),

        };


        Province[] provinces = {
                new Province("Syunic", 41, citiesOfSyunikProvince[0], citiesOfSyunikProvince),
                new Province("Shirak", 44, citiesOfShirakProvince[0], citiesOfShirakProvince),
                new Province("Kotayk", 43, citiesOfKotaykProvince[0], citiesOfKotaykProvince)
        };

        City capitalOfCountry = new City("Yerevan", 125346878L, 4545);


        Country country = new Country("Armenia", "Armenian", capitalOfCountry, provinces);
        System.out.println();
        System.out.println(country);

        System.out.println(" Cloning");

        City capitalOfCountry1 = new City("Yerevan111", 125346878L, 4545);
        country.setCapital(capitalOfCountry1);

        System.out.println(country);


    }
}
