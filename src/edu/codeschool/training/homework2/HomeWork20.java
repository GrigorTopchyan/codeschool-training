package edu.codeschool.training.homework2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

//Write a Java program to find a missing number in an array. Array numbers are from 1 to n
//                     ex. {1,2,3,4,6,7,8,9} 5 is missing

public class HomeWork20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9};
        int sumNumber;
        //Ապրի Գոռը ։D
        //Hazar angam :D
        sumNumber = (array.length + 1) * (array.length + 2) / 2;
        for (int i = 0; i < array.length; i++) {
            sumNumber = sumNumber - array[i];

        }
        System.out.println(sumNumber);

    }
}

