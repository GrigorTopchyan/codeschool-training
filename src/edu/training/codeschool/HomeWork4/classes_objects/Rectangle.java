package edu.training.codeschool.HomeWork4.classes_objects;

public class Rectangle {
    public float length=1.0f;
    public double  width=1.0f;
    public Rectangle(float length){this.length=length;} ;
    public Rectangle(double width){this.width=width;} ;
    public Rectangle(float length, double width){this.width=width;this.length=length;}


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public  double calculateArea(){
        double y; y=length*width;
        return y;
    };
    public  double calculatePerimeter(){
        double x; x=(length+width)*2;
        return x ;
    };

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea()+
                ", perimeter="+calculatePerimeter()+
                '}';
    }
}
