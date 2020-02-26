package homework8;

public final class Country implements Cloneable {
    private  String countryName;
    private String nationality;
    private City capital;
    private Province[] province;

    public Country(String countryName, String nationality, City capital, Province[] province) throws CloneNotSupportedException {
        this.countryName = countryName;
        this.nationality = nationality;
        this.capital = capital.clone();
        this.province = province.clone();
    }

    public Country() {

    }

    public Country setCountryName(String countryName) throws CloneNotSupportedException {

        return new Country(countryName, this.nationality, this.capital, this.province);
    }

    public Country setNationality(String nationality) throws CloneNotSupportedException {

        return new Country(this.countryName, nationality, this.capital, this.province);
    }

    public Country setCapital(City capital) throws CloneNotSupportedException {
        return new Country(this.countryName, this.nationality, capital, this.province);
    }

    public Country setProvince(Province[] province) throws CloneNotSupportedException {
        return new Country(this.countryName, this.nationality, this.capital, province);
    }

    public String getCountryName() {
        return countryName;
    }

    public String getNationality() {
        return nationality;
    }

    public City getCapital() {
        return capital;
    }

    public Province[] getProvince() {
        return province;
    }

    public static Country createCloneCountry(Country country) {
        Country countryClone = new Country();
        countryClone.countryName = country.countryName;
        countryClone.nationality = country.nationality;
        countryClone.capital = country.capital;
        countryClone.province = country.province;
        return countryClone;
    }


    @Override
    public String toString() {
        return "Country name: " +
                countryName + '\n' +
                "Nationality:  " + nationality + '\n' +
                "Capital: " + capital + '\n' +
                "Provinces: " + ArrToString.getToString(province);

    }
}
