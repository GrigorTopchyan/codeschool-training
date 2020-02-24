package homework6.task3.point;


public class Point {




    /**
     * * 3.0 Գրել կլաս Point, որը կնկարագրի մաթեմատիկական կետը(այսինքն կետի կորդինատները x,y)
     * * Կլասսը պիտի ունենա հետևյալ վարքը(bihaviour):
     * * -Երկու կետերի միջև հեռավորությունը
     * * -Երկու կետերի միջնակետը
     */

    //pointy piti erku cordinate unena x, y
    //ancac dasin nayel enq uxxi
    public double coordinateX;

    public double coordinateY;


    public Point(double x, double y) {
        this.coordinateX = x;

        this.coordinateY = y;

    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }



    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }



    public static double getDistanceBetweenTwoPoints(Point point1,Point point2) {
        double distance = Math.sqrt((Math.pow(point2.coordinateX - point1.coordinateX,2)) + (Math.pow(point2.coordinateY - point1.coordinateY,2) ));
        return distance;
    }

    public static void Calculate_Of_The_Coordinates_Of_The_Middle_Of_The_Segment(Point point1,Point point2) {
        double cX = (point1.coordinateX + point2.coordinateX) / 2;
        double cY = (point1.coordinateY + point2.coordinateY) / 2;

        System.out.println("Coordinates Of The Middle Of The Segment XY" + "(" + cX + ", " + cY + ")");
    }
}
