package edu.codeschool.training.HomeWork6.LineAndPoint;

public class Line {
    Point origin;
    Point endpoint;

    public Line(Point origin, Point endpoint) {
        this.origin = origin;
        this.endpoint = endpoint;
    }


    private double distanceCoordinates(Line line) {
        return Point.distanceCoordinates(line.origin,line.endpoint);
    }

    private void beInLine(Line line,Point c) {
        if (line.endpoint.coordinateX > c.coordinateX && line.origin.coordinateX < c.coordinateX && line.endpoint.coordinateY > c.coordinateY && line.origin.coordinateY<c.coordinateY){
            System.out.println("Point in line");
        }else {
            System.out.println("Point isnt in line");
        }

    }
}
