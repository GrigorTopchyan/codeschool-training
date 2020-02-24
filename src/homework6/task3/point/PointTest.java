package homework6.task3.point;

import homework6.task3.point.Point;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 4);
        System.out.println(Point.getDistanceBetweenTwoPoints(point1,point2));
        Point.Calculate_Of_The_Coordinates_Of_The_Middle_Of_The_Segment(point1,point2);
    }
}
