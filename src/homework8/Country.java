package homework8;

public class Country implements Cloneable {
    private String countryName;
    private String nationality;
    private City capital;
    private Province[] province;


    public Country() {
    }

    public Country(String countryName, String nationality, City capital, Province[] province) throws CloneNotSupportedException {
        this.countryName = countryName;
        this.nationality = nationality;
        this.capital = (City) capital.clone();
        this.province = province.clone();
    }

    public City getCityName() throws CloneNotSupportedException {

        return (City) capital.clone();
    }

    public void setProvince(Province[] province) {
        this.province = province;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Province[] getProvince() {

        return province.clone();
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
        Country countryClone = (Country) super.clone();
        countryClone.setCapital((City) capital.clone());
        countryClone.setProvince(province.clone());
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
