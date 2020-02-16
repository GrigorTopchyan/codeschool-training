package edu.codeschool.training.HomeWork6.LineAndPoint;

public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    static double distanceCoordinate(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
    }

    private Point midpoint(Point point1, Point point2) {
        return new Point((point2.x + point1.x) / 2, (point2.y + point1.y) / 2);
    }
}
