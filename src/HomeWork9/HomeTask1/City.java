package HomeWork9.HomeTask1;

public class City implements Cloneable {
    private String name;
    private long countOfResidents;
    private double surface;

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }
}
