package HomeWork6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class TestAnimals {
    public static void main(String[] args) {
        Animal [] animal ={new Cat("C1"),new Dog("D1"),
                new Akita("A1"),new Cat("C2"),new Dog("D2"),
                new Akita("A2")};
        for (int i = 0; i <animal.length ; i++) { ;
           animal[i].greeting();
        }
    }


}
