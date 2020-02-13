package homework6.task3.line;

import homework6.task3.point.Point;

public class Line extends Point {
    /**
     * 3.1 Գրել կլաս Line, որը կնկարագրի մաթեմատիկական ուղղիղը(այսինքն ուղղի սկզբնակետը և վերջնակետը)
     * Կլասսը պիտի ունենա հետևյալ վարքը(bihaviour)
     * -վերադարձնի ուղղի երկարությունը
     * -ստուգի արդյոք տվյալ կետը ուղղի վրա է թէ ոչ
     */
    private double coordinateX3;
    private double coordinateY3;
    public Line(double coordinateX1, double coordinateX2, double coordinateY1, double coordinateY2, double coordinateX3, double coordinateY3) {
        super(coordinateX1, coordinateX1, coordinateY1, coordinateY2);
        this.coordinateX3 = coordinateX3;
        this.coordinateY3 = coordinateY3;
    }

    public double getCoordinateX3() {
        return coordinateX3;
    }

    public void setCoordinateX3(double coordinateX3) {
        this.coordinateX3 = coordinateX3;
    }

    public double getCoordinateY3() {
        return coordinateY3;
    }

    public void setCoordinateY3(double coordinateY3) {
        this.coordinateY3 = coordinateY3;
    }



    public boolean isPointOnLine() {
        return (coordinateX3 * (coordinateX2 - coordinateY1) - coordinateY3 * (coordinateX2 - coordinateX1) == 0);
    }

}
