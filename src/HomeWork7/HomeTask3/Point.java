package HomeWork7.HomeTask3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point number1,Point number2){
        return Math.sqrt(Math.pow((number2.x - number1.x),2)
                + Math.pow(number2.y - number1.y,2));
    }
    public Point middle(Point num1,Point num2){
        int x = (num2.x+num1.x)/2;
        int y = (num2.y+num1.y)/2;
        return new Point(x,y);
    }




}
