package edu.codeschool.training.classes_objects.homeWork9;

public class City {
    private String name;
	private long countOfResidents;
	private double surface;

	public City(String name, long countOfResidents, double surface) {
		this.name = name;
		this.countOfResidents = countOfResidents;
		this.surface = surface;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCountOfResidents() {
		return countOfResidents;
	}

	public void setCountOfResidents(long countOfResidents) {
		this.countOfResidents = countOfResidents;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}
	@Override
	protected City clone() throws CloneNotSupportedException{
		return (City) super.clone();
	}

	@Override
	public String toString() {
		return "City{" +
				"name='" + name + '\'' +
				", countOfResidents=" + countOfResidents +
				", surface=" + surface +
				'}';
	}
}
