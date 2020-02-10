package homework6.point;

/**
 * 3.0 Գրել կլաս Point, որը կնկարագրի մաթեմատիկական կետը(այսինքն կետի կորդինատները x,y)
 * Կլասսը պիտի ունենա հետևյալ վարքը(bihaviour):
 * -Երկու կետերի միջև հեռավորությունը
 * -Երկու կետերի միջնակետը
 * 3.1 Գրել կլաս Line, որը կնկարագրի մաթեմատիկական ուղղիղը(այսինքն ուղղի սկզբնակետը և վերջնակետը)
 * Կլասսը պիտի ունենա հետևյալ վարքը(bihaviour)
 * -վերադարձնի ուղղի երկարությունը
 * -ստուգի արդյոք տվյալ կետը ուղղի վրա է թէ ոչ
 */


public class Point {


    public static void main(String[] args) {
        System.out.println(getDistanceBetweenTwoPoints(1, 2, 2, 4));
        Calculate_Of_The_Coordinates_Of_The_Middle_Of_The_Segment(2.0,2,3,7);
    }

    public static double getDistanceBetweenTwoPoints(double x1, double x2, double y1, double y2) {
        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return distance;
    }
    public static void Calculate_Of_The_Coordinates_Of_The_Middle_Of_The_Segment(double x1, double y1, double x2, double y2) {
        double cX = (x1+x2)/2;
        double cY = (y1+y2)/2;

        System.out.println("Coordinates Of The Middle Of The Segment XY"+"("+cX+", "+cY+")");
    }
}
