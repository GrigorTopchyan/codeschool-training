package edu.codeschool.training.classes_objects.homework4;

public class Rectangle {
    private float width;
    private float  length;

    public Rectangle (float length,float width){
        this.length=length;
        this.width=width;
    }
    public void getLength(){
        this.length = length;
        System.out.println("Length = " + length);
    }
    public void getWidth(){
        this.width = width;
        System.out.println("Width = " + width);
    }
    public void setLength(float length){
        this.length = length;
        System.out.println("Return length = " + this.length);
    }
    public void setWidth(float width){
        this.width = width;
        System.out.println("Return width = " + this.width);
    }
    public float calcArea(float length,float width){
        float calculateArea = length * width;

        return calculateArea;
    }
    public float calcPerimeter(float length,float width){
        float calcPerimeter = 2 * (length + width);

        return calcPerimeter;
    }
    }


