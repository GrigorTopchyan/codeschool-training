package HomeWork9.HomeTask1;

public final class Country {
    private final String name;
    private final String nationality;
    private final City capital;
    private  final Province [] province;


    public Country(String name, String nationality, City capital , Province [] province) throws CloneNotSupportedException {
        this.name = name;
        this.nationality = nationality;
        this.capital = (City) capital.clone();
        this.province= province.clone();

    }

    public String getName() {
        return name;
    }


    public String getNationality() {
        return nationality;
    }


    public City getCapital() {
        return capital;
    }



    @Override
    protected Country clone() throws CloneNotSupportedException {
        Country clone = (Country) super.clone();
        return clone;

    }
}
