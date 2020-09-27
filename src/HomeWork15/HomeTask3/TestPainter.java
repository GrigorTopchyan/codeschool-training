package HomeWork15.HomeTask3;

public class TestPainter {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Painter painter=new Painter();
        painter.paint(rectangle);
        painter.paint(circle);
    }
}
