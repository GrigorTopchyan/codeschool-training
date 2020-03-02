package edu.codeschool.training.classes_objects.homeWork9;

public class Province {
    private String name;
	private long mobileCode;
	private City centreCity;
	private City[] cities;

	@Override
	protected Province clone() throws CloneNotSupportedException {
		return (Province) super.clone();
	}
}
