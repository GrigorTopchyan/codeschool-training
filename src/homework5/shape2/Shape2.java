package homework5.shape2;

//Anuny Shape gri annuneri mej tver mi ogtagorci
public abstract class Shape2 {
    /**
     * 6.1 Write an abstract class Shape with the following properties:
     * An instance variable shapeName of type String
     * An abstract method area()
     * A toString method that returns the name of the shape
     */
    private String shapeName;
    ;

    public Shape2(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();


    @Override
    public String toString() {
        return shapeName;
    }


}
