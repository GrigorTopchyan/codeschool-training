package homework5.shape2;

import homework5.shape.Shape;

import static java.lang.StrictMath.PI;

public class Cylinder extends Shape2 {
    /**
     * 6.3 Create subclass of Shape with name Cylinder with the following properties.
     * private field radius of type double
     * private field height of type double
     * Constructor with all parameters
     * override area method(the area of cylinder = PI * height * radius^2)
     */
    private double radius;
    private double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }


    @Override
    public double area() {
      return PI * height * radius*radius;

    }
}
