package edu.training.codeschool.HomeWork4.classes_objects;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestAccount {
    public static void main(String[] args) {
        Account first = new Account("aaa", "John", 2000);
        Account next = new Account("bbb", "Ann", 2500);
        first.debit(100);
        next.credit(200);
        first.transferTo(next, 500);

        System.out.println(first);
        System.out.println(next);
    }
}



