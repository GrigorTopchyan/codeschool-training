package HomeWork6;

public class Shape {
    //dashtery private sarqi
    //encasulation ches pahel
    String color;
    boolean filled;

    public Shape() {
        this.color = "greeen";
        this.filled = true;
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
        return
                "A Shape with color of " + color + '\'' +
                " filled/not filled " + filled +
                '}';
    }
}
