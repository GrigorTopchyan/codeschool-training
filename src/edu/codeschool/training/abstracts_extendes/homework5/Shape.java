package edu.codeschool.training.abstracts_extendes.homework5;

public class Shape {
    String color = "green";
    boolean filled = true;

    public Shape() {
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
        //pahanjvuma vor ete true a apa tpi Filled ete false a apa Not Filled
        //voch te  filled/Note filled " + filled +
        return "Shape{" +
                "A shape with color of '" + color + '\'' +
                ", filled/Note filled " + filled +
                '}';
    }
}
