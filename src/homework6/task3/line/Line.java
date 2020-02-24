package homework6.task3.line;

import homework6.task3.point.Point;

//Line classy chpiti jarangi Point classin
//Line y piti unena erku Point tipi dasht start u end
//Ancac dasin nayel enq uxxi
public class Line  {
    /**
     * 3.1 Գրել կլաս Line, որը կնկարագրի մաթեմատիկական ուղղիղը(այսինքն ուղղի սկզբնակետը և վերջնակետը)
     * Կլասսը պիտի ունենա հետևյալ վարքը(bihaviour)
     * -վերադարձնի ուղղի երկարությունը
     * -ստուգի արդյոք տվյալ կետը ուղղի վրա է թէ ոչ
     */
    private double coordinateX3;
    private double coordinateY3;
//    public Line(double coordinateY2, double coordinateX3, double coordinateY3) {
//
//        this.coordinateX3 = coordinateX3;
//        this.coordinateY3 = coordinateY3;
//    }

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
//        return (coordinateX3 * (coordinateX2 - coordinateY) - coordinateY3 * (coordinateX2 - coordinateX) == 0);
        return true;
    }

}
