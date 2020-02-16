package HomeWork7.HomeTask3;

public class Line {
    private Point A;
    private Point B;

    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public static double lineLength(Line line) {
        return Point.distance(line.A,line.B);
    }

    public boolean isInLine(Line line,Point C){
        if(line.B.x>C.x&&line.A.x<C.x&&line.B.y>C.y&&line.A.y<C.y){
        //    y=kx+b
            return true;

        }

         return  false;
    }
}