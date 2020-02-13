package homework6.task3.point;


public class Point {




    /**
     * * 3.0 Գրել կլաս Point, որը կնկարագրի մաթեմատիկական կետը(այսինքն կետի կորդինատները x,y)
     * * Կլասսը պիտի ունենա հետևյալ վարքը(bihaviour):
     * * -Երկու կետերի միջև հեռավորությունը
     * * -Երկու կետերի միջնակետը
     */
    public double coordinateX1;
    public double coordinateX2;
    public double coordinateY1;
    public double coordinateY2;


    public Point(double x1, double x2, double y1, double y2) {
        this.coordinateX1 = x1;
        this.coordinateX2 = x2;
        this.coordinateY1 = y1;
        this.coordinateY2 = y2;
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

    public double getDistanceBetweenTwoPoints() {
        double distance = Math.sqrt(((coordinateX2 - coordinateX1) * (coordinateX2 - coordinateX1)) + ((coordinateY2 - coordinateY1) * (coordinateY2 - coordinateY1)));
        return distance;
    }

    public void Calculate_Of_The_Coordinates_Of_The_Middle_Of_The_Segment() {
        double cX = (coordinateX1 + coordinateX2) / 2;
        double cY = (coordinateY1 + coordinateY2) / 2;

        System.out.println("Coordinates Of The Middle Of The Segment XY" + "(" + cX + ", " + cY + ")");
    }


}
