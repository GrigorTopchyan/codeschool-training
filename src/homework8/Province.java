package homework8;


public class Province {
    private String name;
    private long mobileCode;
    private City centreCity;
    private City[] cities;

    public Province() {
    }

    public Province(String name, long mobileCode, City centreCity, City[] cities) {
        this.name = name;
        this.mobileCode = mobileCode;
        this.centreCity = centreCity;
        this.cities = cities;
    }


    @Override
    public String toString() {
        return "Province: " + name + '\n' +
                "MobileCode: " + mobileCode + '\n' +
                "Centre City: " + centreCity + '\n' +
                "Cities: " + '\n' + ArrToString.getToString(cities);

    }
}
