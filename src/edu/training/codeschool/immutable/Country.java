package edu.training.codeschool.immutable;

public final class Country implements Cloneable {
    private final String name;
    private final String nationality;
	private final City capital;
	private final Province[] province;

    public Country(String name, String nationality, City capital, Province[] province) throws CloneNotSupportedException {
        this.name = name;
        this.nationality = nationality;
        this.capital = capital;
        this.province = province;
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

    public Province[] getProvince() {
        return province;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
