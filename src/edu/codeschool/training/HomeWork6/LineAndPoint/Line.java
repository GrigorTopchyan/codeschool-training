package edu.codeschool.training.HomeWork6.LineAndPoint;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }


    public double distance(Line line) {
        return Point.distanceCoordinate(line.start,line.end);
    }

    public boolean isInLine(Point c) {
        if (this.end.x > c.x && this.start.x < c.x && this.end.y > c.y && this.start.y <c.y){
            return true;
        }else {
            return false;
        }
    }
}
