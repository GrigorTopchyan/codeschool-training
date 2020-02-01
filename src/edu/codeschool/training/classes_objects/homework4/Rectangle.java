package edu.codeschool.training.classes_objects.homework4;

public class Rectangle {


    private float length, width;


    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

//    public Rectangle(float length){
//        this.length = length;
//    }
//
//    public Rectangle(float width){
//        this.width = width;
//    }


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }


    public float calculateArea(){
        return length * width;
    }

    public float calculatePerimeter(){
        return 2 * (length + width);
    }


}
