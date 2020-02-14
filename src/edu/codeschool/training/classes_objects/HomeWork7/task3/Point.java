package edu.codeschool.training.classes_objects.HomeWork7.task3;

public class Point<bihaviour> {

     double coordinateX1;
     double coordinateX2;
     double coordinateY1;
     double coordinateY2;
    public Point(double coordinateX1, double coordinateX2, double coordinateY1, double coordinateY2) {
        this.coordinateX1 = coordinateX1;
        this.coordinateX2 = coordinateX2;
        this.coordinateY1 = coordinateY1;
        this.coordinateY2 = coordinateY2;
    }
    public double getCoordinateX1() {
        return coordinateX1;
    }
    public void setCoordinateX1(double coordinateX1) {
        this.coordinateX1 = coordinateX1;
    }
    public double getCoordinateX2() {
        return coordinateX2;
    }
    public void setCoordinateX2(double coordinateX2) {
        this.coordinateX2 = coordinateX2;
    }
    public double getCoordinateY1() {
        return coordinateY1;
    }
    public void setCoordinateY1(double coordinateY1) {
        this.coordinateY1 = coordinateY1;
    }
    public double getCoordinateY2() {
        return coordinateY2;
    }
    public void setCoordinateY2(double coordinateY2) {
        this.coordinateY2 = coordinateY2;
    }
    public double Distance() {
        double distance =  Math.sqrt(Math.pow(coordinateX2 - coordinateX1,2) + Math.pow(coordinateY2 - coordinateY1,2));
        return distance;
    }
    public double Middle() {
        double middle = (coordinateX1 + coordinateX2)/2;
        return middle;
    }
    public double Middle1(){
        double middle1 = (coordinateY1 + coordinateY2)/2;
        return middle1;
    }

}

