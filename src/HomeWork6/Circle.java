package HomeWork6;

public class Circle extends Shape {
    public double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        //karas miangamic veradrcnes
        double a=this.radius*this.radius*Math.PI;
        return a;
    }
    public double getPerimeter(){
        double p =2*Math.PI*this.radius;
        return p;
    }

    @Override
    public String toString() {
        return
                "A Circle with radius= " + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
