
package HomeWork6.HomeTask6;

public abstract class Shape {
   public String shapeName;
   public abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return "Name is " + shapeName;

    }
}