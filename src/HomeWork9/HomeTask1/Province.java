package HomeWork9.HomeTask1;

public class Province implements Cloneable {
    private String name;
    private long mobileCode;
    private City centreCity;
    private City [] cities;

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
    protected Province clone() throws CloneNotSupportedException {
         Province clone=(Province) super.clone();
         clone.setCentreCity((City)centreCity.clone());
         clone.setCities((City[])cities.clone());
         return clone;
    }
}
