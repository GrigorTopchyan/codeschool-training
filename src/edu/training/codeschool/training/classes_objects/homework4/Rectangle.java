package edu.training.codeschool.training.classes_objects.homework4;

public class Rectangle {
    /**
     * The class which has following state and behaviour:
     * Two package private fields length and width of type float with default value 1.0f
     * Three overloaded constructors - constructor which takes length as parameter, constructor which takes width as parameter
     * and constructor which takes length and width as parameters.
     * Following methods:
     * getLength() and getWidth() methods which return length and width respectively.
     * setLength(float length) and setWidth(float width) methods which set the length and width fields respectively
     * calculateArea() and calculatePerimeter() methods which return area and perimeter of rectangle respectively
     */
    private float rectLength = 1.0f;
    private float width = 1.0f;

    public Rectangle(float rectLength) {
        this.rectLength = rectLength;
    }

    public Rectangle(float rectLength, float width) {
        this.rectLength = rectLength;
        this.width = width;
    }

    public void setLength(float length) {
        this.rectLength = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getRectLength() {
        return rectLength;
    }

    public float getWidth() {
        return width;
    }

    public float calculateArea(){
       return getRectLength()*getWidth();
    }
    public float  calculatePerimeter(){
      return (getRectLength()*2)+(getWidth()*2);
    }
}
