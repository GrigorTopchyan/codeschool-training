package edu.training.codeschool.homework_for_09_02_2020.homework_4;

public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        super(side, side);
    }

    public String getSuperRString(){
        return super.toString();
    }

    public String toString() {
        return "A Square with side = " + side + ", which is a subclass of " + getSuperRString() ;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }


}
