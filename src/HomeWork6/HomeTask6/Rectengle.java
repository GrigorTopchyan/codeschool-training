package HomeWork6.HomeTask6;

public class Rectengle extends HomeTask6.Shape {
    private double width;
    private double height;

    public Rectengle(String shapeName, double width, double height) {
        super(shapeName);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double area=width*height;
        return area;
    }
}
