package edu.training.codeschool.homework_for_09_02_2020.homework_4;

public class Shape {
    private String color;
    private boolean filled;
    Shape(){
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
    public String filledCheck(){
        return filled?"filled":"not filled";
    }
    public String toString(){
        return "A Shape with color of " +color + " and " +  filledCheck();
    }
}
