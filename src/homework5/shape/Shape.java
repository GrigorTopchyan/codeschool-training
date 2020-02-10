package homework5.shape;

public abstract class Shape {
    /**
     * 4.1 Create class Shape which contains:
     * Two instance variables color (String) and filled (boolean).
     * Two constructors: a no-arg (no-argument) constructor that initializes the color to "green" and filled to true,
     * and a constructor that initializes the color and filled to the given values.
     * Getter and setter for all the instance variables.
     * A toString() method that returns "A Shape with color of xxx and filled/Not filled".
     */
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }





    @Override
    public String toString() {
        String isFilled = this.filled == true ? " Filled " : "not Filled ";
        return " A Shape with color of " + color + " and filled " + isFilled;
    }
}
