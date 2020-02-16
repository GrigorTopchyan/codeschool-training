package HomeWork8.HomeTask1;

import javax.print.attribute.standard.MediaSize;

public class Double {
    double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    double aDoubleMultiplied(double other){
       return this.x*other;
    }
    double aDoublePlus(double Other){
       return this.x+1;
    }
    double aDoublePercent(int percent){
       return this.x*percent/100;
    }
}
