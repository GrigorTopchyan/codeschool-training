package homework8;

import java.util.Arrays;

public class Country implements Cloneable {
    private String name;
    private String nationality;
    private City capital;
    private Province[] province;
    Country country;
//    public Country() {
//    }

    public Country(String name, String nationality, City capital, Province[] province) {
        this.name = name;
        this.nationality = nationality;
        this.capital = capital;
        this.province = province;
    }

    public Country setName(String name) {
         country = new Country(name,this.nationality,this.capital,this.province);
        return country;
    }

    public Country setNationality(String nationality) {
         country = new Country(this.name,nationality,this.capital,this.province);
        return country;
    }

    public Country setCapital(City capital) {
         country = new Country(this.name,this.nationality,capital,this.province);
        return country;
    }

    public Country setProvince(Province[] province) {
         country = new Country(this.name,this.nationality,this.capital,province);
        return country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Country name: " +
                  name + '\n' +
                "Nationality:  " + nationality + '\n' +
                "Capital: " + capital + '\n'+
                "Provinces: " + Arrays.toString(province);

    }
}
