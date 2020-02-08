package HomeWork6;

public class Square extends Rectangle {
    public Square(double side ) {
          super(side,side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side = " + super.toString();
    }
}

