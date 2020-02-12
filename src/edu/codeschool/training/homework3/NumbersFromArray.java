package edu.codeschool.training.homework3;

import com.javalesson.controlstatement.Array;

import java.util.Arrays;
import java.util.Scanner;

//անունները դզի
public class NumbersFromArray {
    public static void main(String[] args) {
        int n;
        int t;
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();
        int[] arr = arrayFromNumber(n);
        System.out.println(Arrays.toString(arr));


    }
    public static int [] arrayFromNumber(int number){
        int t;
        int counter = 0;
        int [] arr = new int[100];
        while (number != 0) {
            t = number % 10;
            //սենց մի արա մի հատ counter պահի հերթով գումարի
            //օրինակ arr[counter++] = t;
            arr[counter ++] = t;
            number = (number - t)/10;
        }
        return arr;
    }

}
