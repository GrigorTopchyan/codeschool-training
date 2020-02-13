package homework6.task3.point;

import homework6.task3.point.Point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(1, 2, 2, 4);
        System.out.println(point.getDistanceBetweenTwoPoints());
        point.Calculate_Of_The_Coordinates_Of_The_Middle_Of_The_Segment();
    }
}
