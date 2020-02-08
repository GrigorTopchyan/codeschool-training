package edu.training.codeschool.HomeWork;

public class Shape {
    public String colour;
    public boolean filled;

    public Shape() {
        colour = "Green";
        filled = true;
    }

    private Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with colour of " + colour + " and " + filled;
    }

    public class Circle {
        public String colour;
        public boolean filled;
        public double radius;

        public Circle(double radius) {
            radius = 1.0;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public int getArea() {
            double a = Math.PI * Math.pow(radius, radius);
            return (int) a;
        }

        public int getPerimeter() {
            double a1 = 2 * Math.PI * radius;
            return (int) a1;
        }

        @Override
        public String toString() {
            return "A Circle with radius " + radius + "wich is subclass of " + colour + '\'' +
                    filled;
        }
    }

    public class Rectangle {
        public double weidht;
        public double lenght;

        public Rectangle(double weidht, double lenght) {
            this.weidht = 1.0;
            this.lenght = 1.0;
        }

        public double getWeidht() {
            return weidht;
        }

        public void setWeidht(double weidht) {
            this.weidht = weidht;
        }

        public double getLenght() {
            return lenght;
        }

        public void setLenght(double lenght) {
            this.lenght = lenght;
        }

        public int getArea() {
            double a = lenght * weidht;
            return (int) a;
        }

        public int getPerimeter() {
            double a1 = 2 * (lenght + weidht);
            return (int) a1;
        }

        @Override
        public String toString() {
            return "A Rectangle with weidht " + weidht + " and lenght " + lenght +" which is a subclass of ";
        }
        public class Square extends Rectangle{
           Square(double lenght, double weidht){
                super(weidht, lenght);
            }

            public Square(double side) {
                super(side,side);
            }
        }
    }
}
