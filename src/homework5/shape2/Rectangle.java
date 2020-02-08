package homework5.shape2;

public class Rectangle extends Shape2 {
    /**
     * 6.4 Create subclass of Shape with name Rectangle with the following properties.
     * private field width of type double
     * private field height of type double
     * Constructor with all parameters
     * override area() method
     */
    private double width;
    private double length;

    public Rectangle(String shapeName, double width, double length) {
        super(shapeName);
        this.width = width;
        this.length = length;
    }



   @Override
    public void area() {
        double area = length * width;
       System.out.println(area);
    }



}
