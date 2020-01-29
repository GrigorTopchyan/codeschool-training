package HomeWork1;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

;

public class HomeTask8 {
    public static void main(String[] args) {
        double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0;
        double max = n1;
        double min = n4;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
             max = n4;
        }
        System.out.println("max = " + max);
        if (n1 < min) {
            min = n1;
        }
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.println("min = " + min);

    }
}
