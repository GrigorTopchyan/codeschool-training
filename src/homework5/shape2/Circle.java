package homework5.shape2;

public class Circle extends Shape2 {
    /**
     *  6.2 Create subclass of Shape with name Circle with the following properties
     *                            private field radius of type double
     *                            Constructor with all parameters
     *                            Override area() method for Circle
     */
    private double radius;
    private static final double PI = 3.14;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }




    @Override
    public void area() {
        double area = PI * radius * radius;
        System.out.println(area);
    }





}
