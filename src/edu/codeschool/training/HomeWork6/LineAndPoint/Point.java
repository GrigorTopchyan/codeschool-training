package edu.codeschool.training.HomeWork6.LineAndPoint;

public class Point {
    double coordinateX;
    double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    public boolean equals(Object o){
        Point c = (Point) o;
        return c.coordinateX == coordinateX && c.coordinateY == coordinateY;
    }

    static double distanceCoordinates(Point number1, Point number2) {
        return Math.sqrt(Math.toDegrees(number2.coordinateX - number1.coordinateX) + Math.toDegrees(number2.coordinateY - number1.coordinateY));
    }

    private void midpointCoordinates(Point number1,Point number2) {
        System.out.println("Coordinate 1:" + (number2.coordinateX - number1.coordinateX) + "\n Coordinate 2:" + (number2.coordinateY -number1.coordinateY) );
    }
}
