package edu.codeschool.training.classes_objects.homework4;
//
public class Rectangle {
    private float length = 1.0f;
    private double width = 1.0f;

//
public Rectangle (float length){
};
public Rectangle(double width){
};
public Rectangle(float length,double width){

};
//
    public void getLength(){
        this.length = length;
        System.out.println("Length = " + length);
    };
    public void getWidth(){
        this.width = width;
        System.out.println("Width = " + width);
    };
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
        System.out.println("Area = " + calculateArea);
        return calculateArea;
    }
    public float calcPerimeter(float length,float width){
        float calcPerimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter = " + calcPerimeter);
        return calcPerimeter;
    }





}
