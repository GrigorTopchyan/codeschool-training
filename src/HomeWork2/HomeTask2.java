package HomeWork2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //Փոփոխականների աննունները աշխատի իմաստալից դնես
        //օրինակ ստեղ a ի տեղը կարաս գրես factorial
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);


    }
}