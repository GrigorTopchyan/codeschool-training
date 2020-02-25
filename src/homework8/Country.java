package homework8;

public class Country implements Cloneable {
    private String countryName;
    private String nationality;
    private City capital;
    private Province[] province;
    Country country;

    public Country() {
    }

    public Country(String countryName, String nationality, City capital, Province[] province) {
        this.countryName = countryName;
        this.nationality = nationality;
        this.capital = capital;
        this.province = province;
    }

    public Country setCountryName(String countryName) {
        country = new Country(countryName, this.nationality, this.capital, this.province);
        return country;
    }


    public Country setNationality(String nationality) {
        country = new Country(this.countryName, nationality, this.capital, this.province);
        return country;
    }

    public Country setCapital(City capital) {
        country = new Country(this.countryName, this.nationality, capital, this.province);
        return country;
    }

    public Country setProvince(Province[] province) {
        country = new Country(this.countryName, this.nationality, this.capital, province);
        return country;
    }


////////deep cloning
    public static Country deepCloningCountry(  Country country){
        Country cloneCountry = new Country();
        cloneCountry.countryName=country.countryName;
        cloneCountry.nationality=country.nationality;
        cloneCountry.capital=country.capital;
        cloneCountry.province=country.province;
        return cloneCountry;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
